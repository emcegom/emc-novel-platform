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
 * 用户信息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_info")
public class UserInfo {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 登录名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 登录密码-加密
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 加密盐值
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 用户头像
     */
    @TableField(value = "user_photo")
    private String userPhoto;

    /**
     * 用户性别;0-男 1-女
     */
    @TableField(value = "user_sex")
    private Byte userSex;

    /**
     * 账户余额
     */
    @TableField(value = "account_balance")
    private Long accountBalance;

    /**
     * 用户状态;0-正常
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