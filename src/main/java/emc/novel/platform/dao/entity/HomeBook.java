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
 * 小说推荐
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "home_book")
public class HomeBook {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 推荐类型;0-轮播图 1-顶部栏 2-本周强推 3-热门推荐 4-精品推荐
     */
    @TableField(value = "`type`")
    private Byte type;

    /**
     * 推荐排序
     */
    @TableField(value = "sort")
    private Byte sort;

    /**
     * 推荐小说ID
     */
    @TableField(value = "book_id")
    private Long bookId;

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