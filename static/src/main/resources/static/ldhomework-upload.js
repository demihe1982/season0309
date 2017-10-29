$(function(){
    $('form[name="ldhomework-upload"] button').on('click',function(){
                $.ajax({
                    url: '/ldhomework',
                    type: 'POST',
                    data: new FormData($('form[name="ldhomework-upload"]')[0]),
                    cache:false,
                    contentType: false,
                    processData: false,
                    success: function (data) {
                        if(data.code == 0){
                           bootbox.alert("作业提交成功!");
                        }else{
                            bootbox.alert(data.error);
                        }
                    },
                    error: function () {}
                });
    });
});