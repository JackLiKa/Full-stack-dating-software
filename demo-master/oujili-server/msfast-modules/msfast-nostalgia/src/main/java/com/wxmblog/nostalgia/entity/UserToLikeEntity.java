package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxmblog.base.common.entity.BaseEntity;
import com.wxmblog.nostalgia.common.enums.article.PraiseTypeEnum;
import lombok.Data;


/**
 * 用户点赞关联
 *
 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10
 */
@Data
@TableName(value = "user_to_like", autoResultMap = true)
public class UserToLikeEntity extends BaseEntity {


    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 点赞类型 ARTICLE-动态 COMMENT-评论 REPLY-回复
     */
    @TableField("praise_type")
    private PraiseTypeEnum praiseType;
    /**
     * 目标id
     */
    @TableField("target_id")
    private Integer targetId;

}
