package com.jsd.mapper;

import com.jsd.pojo.Classes;
import com.jsd.pojo.Student;

import java.util.List;

public interface ClassesMapper {
    public List<Classes> getAllClasses();

    public Classes getClassesByid(Long classes_id) ;

    public int  addClasses(Classes classes);

    public int updateClasses(Classes classes);

    public int  deleteClasses(Long student_id);

}
