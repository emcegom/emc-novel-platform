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
 * 微信支付
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "pay_wechat")
public class PayWechat {
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
     * 微信支付订单号
     */
    @TableField(value = "transaction_id")
    private String transactionId;

    /**
     * 交易类型;JSAPI-公众号支付 NATIVE-扫码支付 APP-APP支付 MICROPAY-付款码支付 MWEB-H5支付 FACEPAY-刷脸支付
     */
    @TableField(value = "trade_type")
    private String tradeType;

    /**
     * 交易状态;SUCCESS-支付成功 REFUND-转入退款 NOTPAY-未支付 CLOSED-已关闭 REVOKED-已撤销（付款码支付） USERPAYING-用户支付中（付款码支付） PAYERROR-支付失败(其他原因，如银行返回失败)
     */
    @TableField(value = "trade_state")
    private String tradeState;

    /**
     * 交易状态描述
     */
    @TableField(value = "trade_state_desc")
    private String tradeStateDesc;

    /**
     * 订单总金额;单位：分
     */
    @TableField(value = "amount")
    private Integer amount;

    /**
     * 用户支付金额;单位：分
     */
    @TableField(value = "payer_total")
    private Integer payerTotal;

    /**
     * 支付完成时间
     */
    @TableField(value = "success_time")
    private Date successTime;

    /**
     * 支付者用户标识;用户在直连商户appid下的唯一标识
     */
    @TableField(value = "payer_openid")
    private String payerOpenid;

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