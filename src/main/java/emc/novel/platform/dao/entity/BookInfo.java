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
 * 小说信息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "book_info")
public class BookInfo {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 作品方向;0-男频 1-女频
     */
    @TableField(value = "work_direction")
    private Byte workDirection;

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
     * 小说封面地址
     */
    @TableField(value = "pic_url")
    private String picUrl;

    /**
     * 小说名
     */
    @TableField(value = "book_name")
    private String bookName;

    /**
     * 作家id
     */
    @TableField(value = "author_id")
    private Long authorId;

    /**
     * 作家名
     */
    @TableField(value = "author_name")
    private String authorName;

    /**
     * 书籍描述
     */
    @TableField(value = "book_desc")
    private String bookDesc;

    /**
     * 评分;总分:10 ，真实评分 = score/10
     */
    @TableField(value = "score")
    private Byte score;

    /**
     * 书籍状态;0-连载中 1-已完结
     */
    @TableField(value = "book_status")
    private Byte bookStatus;

    /**
     * 点击量
     */
    @TableField(value = "visit_count")
    private Long visitCount;

    /**
     * 总字数
     */
    @TableField(value = "word_count")
    private Integer wordCount;

    /**
     * 评论数
     */
    @TableField(value = "comment_count")
    private Integer commentCount;

    /**
     * 最新章节ID
     */
    @TableField(value = "last_chapter_id")
    private Long lastChapterId;

    /**
     * 最新章节名
     */
    @TableField(value = "last_chapter_name")
    private String lastChapterName;

    /**
     * 最新章节更新时间
     */
    @TableField(value = "last_chapter_update_time")
    private Date lastChapterUpdateTime;

    /**
     * 是否收费;1-收费 0-免费
     */
    @TableField(value = "is_vip")
    private Byte isVip;

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