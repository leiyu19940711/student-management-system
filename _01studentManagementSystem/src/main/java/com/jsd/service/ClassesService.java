package com.jsd.service;

import com.jsd.pojo.Classes;
import com.jsd.pojo.Student;

import java.util.List;

public interface ClassesService {
    public List<Classes> getAllClasses();

    public  Classes getClassesByid(Long classes_id);

    public int  addClasses(Classes classes);

    public int updateClasses(Classes classes);

    public  int  deleteClassesByid(Long classes_id);
}
