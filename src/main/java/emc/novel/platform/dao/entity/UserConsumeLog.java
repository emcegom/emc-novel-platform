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
 * 用户消费记录
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_consume_log")
public class UserConsumeLog {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 消费用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 消费使用的金额;单位：屋币
     */
    @TableField(value = "amount")
    private Integer amount;

    /**
     * 消费商品类型;0-小说VIP章节
     */
    @TableField(value = "product_type")
    private Byte productType;

    /**
     * 消费的的商品ID;例如：章节ID
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 消费的的商品名;例如：章节名
     */
    @TableField(value = "produc_name")
    private String producName;

    /**
     * 消费的的商品值;例如：1
     */
    @TableField(value = "produc_value")
    private Integer producValue;

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