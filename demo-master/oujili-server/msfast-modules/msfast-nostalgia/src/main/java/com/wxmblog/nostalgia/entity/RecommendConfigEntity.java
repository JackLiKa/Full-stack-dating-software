package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxmblog.base.common.entity.BaseEntity;
import com.wxmblog.nostalgia.common.handle.UserCityListTypeHandler;
import lombok.Data;

import java.util.List;


/**
 * 推荐配置
 *
 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10
 */
@Data
@TableName(value = "recommend_config", autoResultMap = true)
public class RecommendConfigEntity extends BaseEntity {

    /**
     * 地址
     */
    @TableField(value = "city", typeHandler = UserCityListTypeHandler.class)
    private List<String> city;
    /**
     * 最小年龄
     */
    @TableField("min_age")
    private Integer minAge;
    /**
     * 最大年龄
     */
    @TableField("max_age")
    private Integer maxAge;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

}
