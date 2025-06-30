package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wxmblog.base.common.entity.BaseEntity;
import lombok.Data;

/**

 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10


这个代码定义了一个名为 AreaEntity 的 Java 类，该类表示地区的实体。具体解释如下：
@Data 注解：来自 Lombok 库，自动生成 getter、setter、toString、equals 和 hashCode 方法。
@TableName(value = "area", autoResultMap = true) 注解：指定该实体对应的数据库表名为 area，并启用自动结果映射。
AreaEntity 类继承自 BaseEntity，可能包含一些通用的实体属性（如 id、创建时间、更新时间等）。
字段解释：
regionCode：区域代码，对应数据库表中的 region_code 列。
regionName：区域名称，对应数据库表中的 region_name 列。
parentCode：父级代码，对应数据库表中的 parent_code 列。
sort：排序，对应数据库表中的 sort 列。

*/

@Data
@TableName(value = "area", autoResultMap = true)
public class AreaEntity extends BaseEntity {


    /**
     * 区域代码
     */
    @TableField("region_code")
    private String regionCode;
    /**
     * 区域名称
     */
    @TableField("region_name")
    private String regionName;
    /**
     * 父级代码
     */
    @TableField("parent_code")
    private String parentCode;
    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

}
