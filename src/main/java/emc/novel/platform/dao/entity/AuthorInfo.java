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
 * 作者信息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "author_info")
public class AuthorInfo {
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
     * 邀请码
     */
    @TableField(value = "invite_code")
    private String inviteCode;

    /**
     * 笔名
     */
    @TableField(value = "pen_name")
    private String penName;

    /**
     * 手机号码
     */
    @TableField(value = "tel_phone")
    private String telPhone;

    /**
     * QQ或微信账号
     */
    @TableField(value = "chat_account")
    private String chatAccount;

    /**
     * 电子邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 作品方向;0-男频 1-女频
     */
    @TableField(value = "work_direction")
    private Byte workDirection;

    /**
     * 0：正常;1-封禁
     */
    @TableField(value = "`status`")
    private Byte status;

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