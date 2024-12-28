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
 * 小说章节
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "book_chapter")
public class BookChapter {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    private Long bookId;

    /**
     * 章节号
     */
    @TableField(value = "chapter_num")
    private Short chapterNum;

    /**
     * 章节名
     */
    @TableField(value = "chapter_name")
    private String chapterName;

    /**
     * 章节字数
     */
    @TableField(value = "word_count")
    private Integer wordCount;

    /**
     * 是否收费;1-收费 0-免费
     */
    @TableField(value = "is_vip")
    private Byte isVip;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;
}