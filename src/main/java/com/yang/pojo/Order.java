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
 * @Date 2024/3/18 9:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @TableId(value = "id")
    private Long id;

    private Long stuId;

    private Long bikeId;

    private Date orderTime;

    private Date boardingTime;

    private Long boardingLocationId;

    private Date offTime;

    private Long offLocationId;

    @TableField(value = "is_finish")
    private boolean finish;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
