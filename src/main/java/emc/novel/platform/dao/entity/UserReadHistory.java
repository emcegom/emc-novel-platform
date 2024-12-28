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
 * 用户阅读历史
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_read_history")
public class UserReadHistory {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    private Long bookId;

    /**
     * 上一次阅读的章节内容表ID
     */
    @TableField(value = "pre_content_id")
    private Long preContentId;

    /**
     * 创建时间;
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间;
     */
    @TableField(value = "update_time")
    private Date updateTime;
}