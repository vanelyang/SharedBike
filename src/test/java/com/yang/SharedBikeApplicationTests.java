package com.yang;

import com.yang.pojo.Student;
import com.yang.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SharedBikeApplicationTests {

    @Autowired
    private StudentService studentService;
    @Test
    void contextLoads() {
        studentService.save(new Student());
    }

}
