package com.yang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.pojo.Student;
import com.yang.util.Result;


/**
 * @Author Yang
 * @Date 2024/3/18 9:39
 */
public interface StudentService extends IService<Student> {
    Result addOneStudent(Student student);
}
