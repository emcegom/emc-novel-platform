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
 * 新闻类别
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "news_category")
public class NewsCategory {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 类别名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Byte sort;

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