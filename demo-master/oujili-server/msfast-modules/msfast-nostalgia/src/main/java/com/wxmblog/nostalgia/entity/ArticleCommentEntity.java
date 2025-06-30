package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wxmblog.base.common.entity.BaseEntity;
import lombok.Data;


/**
 * 用户动态评论
 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10
 *
动态评论

 这个代码定义了一个名为 ArticleCommentEntity 的 Java 类，该类表示文章评论信息的实体。具体解释如下：
 @Data 注解：来自 Lombok 库，自动生成 getter、setter、toString、equals 和 hashCode 方法。
 @TableName(value = "article_comment", autoResultMap = true) 注解：指定该实体对应的数据库表名为 article_comment，并启用自动结果映射。
 ArticleCommentEntity 类继承自 BaseEntity，可能包含一些通用的实体属性（如 id、创建时间、更新时间等）。
 字段解释：
 userId：用户的 ID，对应数据库表中的 user_id 列。
 articleId：文章的 ID，对应数据库表中的 article_id 列。
 content：评论内容，对应数据库表中的 content 列。
 likeCount：点赞数，对应数据库表中的 like_count 列。
 lastCommentReplyId：最近的一条回复信息的 ID，对应数据库表中的 last_comment_reply_id 列。
 replyCount：回复数，对应数据库表中的 reply_count 列。
 */
@Data
@TableName(value = "article_comment", autoResultMap = true)
public class ArticleCommentEntity extends BaseEntity {


    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 动态id
     */
    @TableField("article_id")
    private Integer articleId;
    /**
     * 评论内容
     */
    @TableField("content")
    private String content;
    /**
     * 点赞数
     */
    @TableField("like_count")
    private Integer likeCount;

    /**
     * 最近的一条回复信息
     */
    @TableField("last_comment_reply_id")
    private Integer lastCommentReplyId;

    @TableField("reply_count")
    private Integer replyCount;
}
