package com.jsd.service;

import com.jsd.pojo.Classes;
import com.jsd.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudentService {
    public List<Student> getAllStudent();

    public  Student getStudentByid(Long student_id);

    public int  addStudent(Student student);

    public int updateStudent(Student student);

    public  int  deleteStudentByid(Long student_id);

    public  int deleteStudentByClassesId(Long Classes_id);
}
