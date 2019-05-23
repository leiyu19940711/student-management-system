package com.jsd.mapper;

import com.jsd.pojo.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> getAllStudent();

    public Student getStudentByid(Long student_id) ;

    public int  addStudent(Student student);

    public int updateStudent(Student student);

    public int  deleteStudent(Long student_id);

    public int deleteStudentByClassesId(Long student_classesid);


}
