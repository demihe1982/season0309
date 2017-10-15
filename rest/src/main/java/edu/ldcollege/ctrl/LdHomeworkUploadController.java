package edu.ldcollege.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ldhomework")
public class LdHomeworkUploadController {


    @RequestMapping("/upload")
    public Object upload(Integer userId, Integer classId, Integer lessonId, MultipartFile file){
        Map<String,Object> retVal = new HashMap<>();
        retVal.put("userId",userId);
        retVal.put("classId",classId);
        retVal.put("lessonId",lessonId);
        retVal.put("file",file);
        return retVal;
    }

}
