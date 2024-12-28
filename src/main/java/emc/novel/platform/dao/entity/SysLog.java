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
 * 系统日志
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_log")
public class SysLog {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 用户操作
     */
    @TableField(value = "`operation`")
    private String operation;

    /**
     * 响应时间
     */
    @TableField(value = "`time`")
    private Integer time;

    /**
     * 请求方法
     */
    @TableField(value = "`method`")
    private String method;

    /**
     * 请求参数
     */
    @TableField(value = "params")
    private String params;

    /**
     * IP地址
     */
    @TableField(value = "ip")
    private String ip;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
}