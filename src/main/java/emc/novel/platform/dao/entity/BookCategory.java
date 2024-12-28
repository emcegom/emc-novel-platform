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
 * 小说类别
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "book_category")
public class BookCategory {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 作品方向;0-男频 1-女频
     */
    @TableField(value = "work_direction")
    private Byte workDirection;

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