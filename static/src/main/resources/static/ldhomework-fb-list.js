$(function(){
        $.get("/ldhomework/list",{},function(data){
            var $tbBody = $("#homework-list>tbody");
            $tbBody.empty();
            var $tr="";
            for(var i=0 ;i < data.length;i++){
                $tr="<tr>";
                $tr+="<td>";
                $tr+=data[i].userId;
                $tr+="</td>";
                $tr+="<td>";
                $tr+=data[i].homeworkName;
               $tr+="</td>";
                $tr+="<td>";
                $tr+=data[i].createDate;
                $tr+="</td>";
                $tr+="<td>";
                $tr+=$.trim(data[i].starCount);
                $tr+="</td>";
               $tr+="<td>";
                $tr+=$.trim(data[i].negativeCount);
                $tr+="</td>";
                $tr+="<td>";
                $tr+=$.trim(data[i].bestFlag);
                $tr+="</td>";
                $tr+="<td>";
                $tr+=$.trim(data[i].correctFlag);
                $tr+="</td>";
                $tr+="<td><a href='javascript:return false;'>我要评价</a></td>";
               $tr+="</tr>";
               $tbBody.append($tr);
            }
        });
});