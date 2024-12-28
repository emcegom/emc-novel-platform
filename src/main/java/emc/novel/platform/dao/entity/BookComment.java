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
 * 小说评论
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "book_comment")
public class BookComment {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 评论小说ID
     */
    @TableField(value = "book_id")
    private Long bookId;

    /**
     * 评论用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 评价内容
     */
    @TableField(value = "comment_content")
    private String commentContent;

    /**
     * 回复数量
     */
    @TableField(value = "reply_count")
    private Integer replyCount;

    /**
     * 审核状态;0-待审核 1-审核通过 2-审核不通过
     */
    @TableField(value = "audit_status")
    private Byte auditStatus;

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