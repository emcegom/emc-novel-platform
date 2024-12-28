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
 * 新闻信息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "news_info")
public class NewsInfo {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 类别ID
     */
    @TableField(value = "category_id")
    private Long categoryId;

    /**
     * 类别名
     */
    @TableField(value = "category_name")
    private String categoryName;

    /**
     * 新闻来源
     */
    @TableField(value = "source_name")
    private String sourceName;

    /**
     * 新闻标题
     */
    @TableField(value = "title")
    private String title;

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