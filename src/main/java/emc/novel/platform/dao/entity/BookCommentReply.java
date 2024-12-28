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
 * 小说评论回复
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "book_comment_reply")
public class BookCommentReply {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 评论ID
     */
    @TableField(value = "comment_id")
    private Long commentId;

    /**
     * 回复用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 回复内容
     */
    @TableField(value = "reply_content")
    private String replyContent;

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