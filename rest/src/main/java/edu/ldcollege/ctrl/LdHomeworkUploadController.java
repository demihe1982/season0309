package edu.ldcollege.ctrl;

import edu.ldcollege.domain.LdHomeWork;
import edu.ldcollege.service.LdHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LdHomeworkUploadController {

    @Value("${upload.path}")
    private String uploadPath="/upload";

    @Autowired
    private LdHomeworkService ldHomeworkService;

    @RequestMapping(value = "/ldhomework",method = RequestMethod.POST)
    public Object upload(@RequestParam Integer userId,@RequestParam Integer classId,@RequestParam Integer lessonId,@RequestParam MultipartFile file){
        Map<String,Object> retVal = new HashMap<>();
        retVal.put("fileSize",file.getSize());
        String filename = file.getOriginalFilename();
        String filepath = Paths.get(uploadPath, filename).toString();
        BufferedOutputStream stream = null;
        try {
        // Save the file locally
            stream= new BufferedOutputStream(new FileOutputStream(new File(filepath)));
            stream.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(stream!=null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        LdHomeWork homeWork = new LdHomeWork();
        homeWork.setUserId(userId);
        homeWork.setClassId(classId);
        homeWork.setCreateDate(new Date());
        homeWork.setLessonId(lessonId);
        homeWork.setHomeworkName(filename);
        homeWork.setHomeworkFilePath(filename);
        ldHomeworkService.saveHomeWork(homeWork);

        return retVal;
    }

    @RequestMapping("/ldhomework/list")
    public Object list(){
        return ldHomeworkService.queryALL();
    }


    @RequestMapping("/test")
    public Object test(@RequestParam("name") String name){
        return name;
    }

}
