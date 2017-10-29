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

    private final int MAX_FILE_SIZE = 5 * 1024 * 1024;

    @Value("${upload.path}")
    private String uploadPath="/upload";

    @Autowired
    private LdHomeworkService ldHomeworkService;

    @RequestMapping(value = "/ldhomework",method = RequestMethod.POST)
    public Object upload(@RequestParam Integer userId,@RequestParam Integer classId,@RequestParam Integer lessonId,@RequestParam MultipartFile file){
        Map<String,Object> retVal = checkFileSize(file);

        if(retVal.isEmpty()){
            retVal.put("code",0);
        }else {
            retVal.put("code",-1);
        }

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


    private Map<String,Object> checkFileSize(MultipartFile file){
        Map<String,Object> checkResult = new HashMap<>();
        try {
            int fileSize = file.getBytes().length;
            if(fileSize > MAX_FILE_SIZE){
                checkResult.put("error","上传文件超过5M");
            }else {
                String fileName = file.getName();
                if(!fileName.endsWith(".pdf") || !fileName.endsWith(".ppt") || !fileName.endsWith(".pptx")){
                    checkResult.put("error","上传PPT或PDF文件");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return checkResult;
    }

}
