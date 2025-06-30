package com.wxmblog.nostalgia.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wxmblog.base.common.entity.BaseEntity;
import com.wxmblog.nostalgia.common.enums.user.PayOrderStatusEnum;
import lombok.Data;


/**
 * 支付订单
 *
 *
 * @author JackLi
 * @email  1302691900@qq.com
 * @date 2025年3月12日 15:23:10
 */
@Data
@TableName(value = "pay_order", autoResultMap = true)
public class PayOrderEntity extends BaseEntity {

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 标题
     */
    @TableField("title")
    private String title;
    /**
     * 商户订单号
     */
    @TableField("out_trade_no")
    private String outTradeNo;
    /**
     * 标价金额 单位为元
     */
    @TableField("total_fee")
    private Integer totalFee;
    /**
     * 状态
     */
    @TableField("status")
    private PayOrderStatusEnum status;

    @TableField("product_no")
    private Integer productNo;

}
