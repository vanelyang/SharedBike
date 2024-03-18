package com.yang.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

/**
 * @Author Yang
 * @Date 2024/3/18 9:18
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String locationName;

    private int capacity;

    private int spare;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date update_Time;



}
