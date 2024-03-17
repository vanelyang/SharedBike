package com.yang.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author Yang
 * @Date 2024/3/17 19:50
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @TableId(value = "id")
    private Long id;

    @TableField(value = "stu_num")
    private String stuNum;

    private String stuName;

    private String idcard;

    private String phone;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
