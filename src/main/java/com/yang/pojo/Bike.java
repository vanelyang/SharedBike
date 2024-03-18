package com.yang.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * @Author Yang
 * @Date 2024/3/18 9:06
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String number;

    @TableField(value = "is_free")
    private boolean free;

    private Long locationId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
