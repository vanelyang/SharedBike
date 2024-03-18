package com.yang.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author Yang
 * @Date 2024/3/18 11:10
 *  添加更新时自动插入时间
 */

@Component
public class DateConfig implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
//        this.setFieldValByName("createTime", new Date(), metaObject);
//        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }
}