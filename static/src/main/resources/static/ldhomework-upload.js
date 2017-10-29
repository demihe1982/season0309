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
                        alert(data.fileSize);
                    },
                    error: function () {}
                });

          /* var data = $('form[name="ldhomework-upload"] button').serialize();
           $.post("/ldhomework/upload",data,function(data){
                alert(data);
           });*/
    });
});