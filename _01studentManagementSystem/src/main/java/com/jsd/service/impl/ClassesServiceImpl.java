package com.jsd.service.impl;

import com.jsd.mapper.ClassesMapper;
import com.jsd.pojo.Classes;
import com.jsd.service.ClassesService;
import com.jsd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    @Autowired
    private StudentService studentService;

    @Override
    public List<Classes> getAllClasses() {
        return classesMapper.getAllClasses();
    }

    @Override
    public Classes getClassesByid(Long classes_id) {
        return classesMapper.getClassesByid(classes_id);
    }

    @Override
    public int addClasses(Classes classes) {
        return classesMapper.addClasses(classes);
    }

    @Override
    public int updateClasses(Classes classes) {
        return classesMapper.updateClasses(classes);
    }

    @Override
    public int deleteClassesByid(Long classes_id) {
        int i=classesMapper.deleteClasses(classes_id);
        if(i>0){
            studentService.deleteStudentByClassesId(classes_id);
        }
        return i;
    }
}
