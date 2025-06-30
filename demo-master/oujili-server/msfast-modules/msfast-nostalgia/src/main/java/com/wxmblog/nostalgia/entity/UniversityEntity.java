package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wxmblog.base.common.entity.BaseEntity;
import lombok.Data;


/**
 * 大学
 *
 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10
 */
@Data
@TableName(value = "university", autoResultMap = true)
public class UniversityEntity extends BaseEntity {

    /**
     * 学校名称
     */
    @TableField("name")
    private String name;

}
