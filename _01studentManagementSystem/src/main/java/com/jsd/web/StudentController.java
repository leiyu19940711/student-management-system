package com.jsd.web;

import com.alibaba.fastjson.JSON;
import com.jsd.service.StudentService;
import com.jsd.pojo.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "学生接口")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "查询所有学生" ,  notes="查询所有学生")
    @GetMapping("/queryallstudent")
    @ResponseBody
   public String queryAllStudent(){
        List<Student> list = studentService.getAllStudent();
       return JSON.toJSONString(list);
   }

    @ApiOperation(value = "查询用户根据id" ,  notes="查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "student_id", value = "学生id标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/querystudentbyid",method=RequestMethod.GET)
    public String queryUser(@RequestParam("student_id") Long student_id){
        Student student=studentService.getStudentByid(student_id);
        return JSON.toJSONString(student);
    }

    @ApiOperation(value = "新增学生" ,  notes="新增学生")
    @RequestMapping(value="/addstudent",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String  addstudent(@RequestBody Student student){
        int i= studentService.addStudent(student);
        if(i>0){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    @ApiOperation(value = "修改学生信息" ,  notes="修改学生信息")
    @RequestMapping(value="/updateStudent",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String updateStudent(@RequestBody Student student){
        int i= studentService.updateStudent(student);
        if(i>0){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    @ApiOperation(value = "删除学生" ,  notes="删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "student_id", value = "用户标识", required = true, paramType = "query", dataType = "Long")
    })
    @RequestMapping(value="/deleteStudent",method= RequestMethod.DELETE)
    public String deleteUser(@RequestParam("student_id") Long student_id){
       int i= studentService.deleteStudentByid(student_id);
       if(i>0){
           return "删除成功";
       }else{
           return "删除失败";
       }

    }



}
