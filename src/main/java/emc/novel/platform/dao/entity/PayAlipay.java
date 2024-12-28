package emc.novel.platform.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付宝支付
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "pay_alipay")
public class PayAlipay {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 商户订单号
     */
    @TableField(value = "out_trade_no")
    private String outTradeNo;

    /**
     * 支付宝交易号
     */
    @TableField(value = "trade_no")
    private String tradeNo;

    /**
     * 买家支付宝账号 ID
     */
    @TableField(value = "buyer_id")
    private String buyerId;

    /**
     * 交易状态;TRADE_SUCCESS-交易成功
     */
    @TableField(value = "trade_status")
    private String tradeStatus;

    /**
     * 订单金额;单位：分
     */
    @TableField(value = "total_amount")
    private Integer totalAmount;

    /**
     * 实收金额;单位：分
     */
    @TableField(value = "receipt_amount")
    private Integer receiptAmount;

    /**
     * 开票金额
     */
    @TableField(value = "invoice_amount")
    private Integer invoiceAmount;

    /**
     * 交易创建时间
     */
    @TableField(value = "gmt_create")
    private Date gmtCreate;

    /**
     * 交易付款时间
     */
    @TableField(value = "gmt_payment")
    private Date gmtPayment;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}