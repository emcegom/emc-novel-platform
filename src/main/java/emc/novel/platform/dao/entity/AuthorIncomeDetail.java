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
 * 稿费收入明细统计
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "author_income_detail")
public class AuthorIncomeDetail {
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
     * 小说ID;0表示全部作品
     */
    @TableField(value = "book_id")
    private Long bookId;

    /**
     * 收入日期
     */
    @TableField(value = "income_date")
    private Date incomeDate;

    /**
     * 订阅总额
     */
    @TableField(value = "income_account")
    private Integer incomeAccount;

    /**
     * 订阅次数
     */
    @TableField(value = "income_count")
    private Integer incomeCount;

    /**
     * 订阅人数
     */
    @TableField(value = "income_number")
    private Integer incomeNumber;

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