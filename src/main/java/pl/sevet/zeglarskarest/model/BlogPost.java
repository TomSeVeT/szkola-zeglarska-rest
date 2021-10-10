package pl.sevet.zeglarskarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String briefDescription;

    private String text;

    private Long userId;

    private Date postDate;

    private Long categoryId;


    public BlogPost(Long id, String name, String briefDescription, String text, Long userId, Date postDate, Long categoryId) {
        this.id = id;
        this.name = name;
        this.briefDescription = briefDescription;
        this.text = text;
        this.userId = userId;
        this.postDate = postDate;
        this.categoryId = categoryId;
    }

    public BlogPost(String name, String briefDescription, String text, Long userId, Date postDate, Long categoryId) {
        this.name = name;
        this.briefDescription = briefDescription;
        this.text = text;
        this.userId = userId;
        this.postDate = postDate;
        this.categoryId = categoryId;
    }

    public BlogPost() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
