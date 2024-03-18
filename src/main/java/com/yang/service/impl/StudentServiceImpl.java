package com.yang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.mapper.StudentMapper;
import com.yang.pojo.Student;
import com.yang.service.StudentService;
import com.yang.util.Result;
import org.springframework.stereotype.Service;

/**
 * @Author Yang
 * @Date 2024/3/18 9:40
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Override
    public Result addOneStudent(Student student) {
        System.out.println("hello");
        return Result.ok();
    }
}
