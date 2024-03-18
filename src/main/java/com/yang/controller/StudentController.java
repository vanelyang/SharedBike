package com.yang.controller;

import com.yang.pojo.Student;
import com.yang.service.StudentService;
import com.yang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Yang
 * @Date 2024/3/18 9:56
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //添加一个学生 传 json 字符串过来
    @PostMapping("/addOneStudent")
    public Result addOneStudent(@RequestBody Student student){
        return studentService.addOneStudent(student);
    }

    // 批量添加学生
    @PostMapping("/addStudents")
    public Result addStudents(@RequestBody List<Student> studentList){
        return studentService.addStudents(studentList);
    }

}
