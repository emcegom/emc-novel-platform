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
 * 稿费收入统计
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "author_income")
public class AuthorIncome {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 作家ID
     */
    @TableField(value = "author_id")
    private Long authorId;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    private Long bookId;

    /**
     * 收入月份
     */
    @TableField(value = "income_month")
    private Date incomeMonth;

    /**
     * 税前收入;单位：分
     */
    @TableField(value = "pre_tax_income")
    private Integer preTaxIncome;

    /**
     * 税后收入;单位：分
     */
    @TableField(value = "after_tax_income")
    private Integer afterTaxIncome;

    /**
     * 支付状态;0-待支付 1-已支付
     */
    @TableField(value = "pay_status")
    private Byte payStatus;

    /**
     * 稿费确认状态;0-待确认 1-已确认
     */
    @TableField(value = "confirm_status")
    private Byte confirmStatus;

    /**
     * 详情
     */
    @TableField(value = "detail")
    private String detail;

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