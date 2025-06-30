package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wxmblog.base.common.entity.BaseEntity;
import lombok.Data;

/**

 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10
 *
@Data 注解：来自 Lombok 库，自动生成 getter、setter、toString、equals 和 hashCode 方法。
@TableName(value = "article_background", autoResultMap = true) 注解：指定该实体对应的数据库表名为 article_background，并启用自动结果映射。
ArticleBackgroundEntity 类继承自 BaseEntity，可能包含一些通用的实体属性（如 id、创建时间、更新时间等）。
字段解释：
userId：用户的 ID，对应数据库表中的 user_id 列。
backgroundUrl：背景图片的 URL，对应数据库表中的 background_url 列
*/

@Data
@TableName(value = "article_background", autoResultMap = true)
public class ArticleBackgroundEntity extends BaseEntity {


    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 背景图片
     */
    @TableField("background_url")
    private String backgroundUrl;

}
