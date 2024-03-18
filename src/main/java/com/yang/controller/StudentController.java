package com.yang.controller;

import com.yang.pojo.Student;
import com.yang.service.StudentService;
import com.yang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yang
 * @Date 2024/3/18 9:56
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addOneStudent")
    public Result addOneStudent(Student student){
        return studentService.addOneStudent(student);
    }

}
