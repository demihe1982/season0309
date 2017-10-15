$(function(){
    $('form[name="ldhomework-upload"] button').on('click',function(){
      $.post("/ldhomework/upload",new FormData($('form[name="ldhomework-upload"]')[0]),
        function(data){
                alert(data);
        }
       );
    });
});