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
 * 友情链接
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "home_friend_link")
public class HomeFriendLink {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 链接名
     */
    @TableField(value = "link_name")
    private String linkName;

    /**
     * 链接url
     */
    @TableField(value = "link_url")
    private String linkUrl;

    /**
     * 排序号
     */
    @TableField(value = "sort")
    private Byte sort;

    /**
     * 是否开启;0-不开启 1-开启
     */
    @TableField(value = "is_open")
    private Byte isOpen;

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