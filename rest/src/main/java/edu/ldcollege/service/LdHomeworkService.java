package edu.ldcollege.service;

import edu.ldcollege.domain.LdHomeWork;
import edu.ldcollege.domain.LdHomeWorkFbMapper;
import edu.ldcollege.domain.LdHomeWorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LdHomeworkService {
    @Autowired
    private LdHomeWorkMapper ldHomeWorkMapper;
    @Autowired
    private LdHomeWorkFbMapper ldHomeWorkFbMapper;

    public boolean saveHomeWork(LdHomeWork homeWork){
        if(ldHomeWorkMapper.insert(homeWork) > 0){
            return true;
        }
        return true;
    }

    public List<LdHomeWork> queryALL(){
        return ldHomeWorkMapper.selectAll();
    }




}
