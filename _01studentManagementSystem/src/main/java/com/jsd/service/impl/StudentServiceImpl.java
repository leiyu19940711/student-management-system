package com.jsd.service.impl;

import com.jsd.service.StudentService;
import com.jsd.mapper.StudentMapper;
import com.jsd.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }

    @Override
    public int addStudent(Student student) {
          boolean flag= true;
           int i=0;
          System.out.println(student);
         if(student.getStudent_age()<0||student.getStudent_age()>150){
             flag=false;
         }
          if(flag){
             i=studentMapper.addStudent(student);
          }
          return  i;
    }

    @Override
    public int updateStudent(Student student) {
        int i =studentMapper.updateStudent(student);
        return i;
    }

    @Override
    public Student getStudentByid(Long student_id) {
        return studentMapper.getStudentByid(student_id);
    }

    @Override
    public int  deleteStudentByid(Long student_id) {
        int i=studentMapper.deleteStudent(student_id);
        return i;
    }

    @Override
    public int deleteStudentByClassesId(Long Classes_id) {
        int i=studentMapper.deleteStudentByClassesId(Classes_id);
        return 0;
    }
}
