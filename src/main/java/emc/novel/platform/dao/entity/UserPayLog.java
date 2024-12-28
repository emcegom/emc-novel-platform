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
 * 用户充值记录
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_pay_log")
public class UserPayLog {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 充值用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 充值方式;0-支付宝 1-微信
     */
    @TableField(value = "pay_channel")
    private Byte payChannel;

    /**
     * 商户订单号
     */
    @TableField(value = "out_trade_no")
    private String outTradeNo;

    /**
     * 充值金额;单位：分
     */
    @TableField(value = "amount")
    private Integer amount;

    /**
     * 充值商品类型;0-屋币 1-包年VIP
     */
    @TableField(value = "product_type")
    private Byte productType;

    /**
     * 充值商品ID
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 充值商品名;示例值：屋币
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 充值商品值;示例值：255
     */
    @TableField(value = "product_value")
    private Integer productValue;

    /**
     * 充值时间
     */
    @TableField(value = "pay_time")
    private Date payTime;

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