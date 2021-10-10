package pl.sevet.zeglarskarest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Opinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private String author;

    private Date opinionDate;

    private String location;

    public Opinion(Long id, String text, String author, Date opinionDate, String location) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.opinionDate = opinionDate;
        this.location = location;
    }

    public Opinion(String text, String author, Date opinionDate, String location) {
        this.text = text;
        this.author = author;
        this.opinionDate = opinionDate;
        this.location = location;
    }

    public Opinion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getOpinionDate() {
        return opinionDate;
    }

    public void setOpinionDate(Date opinionDate) {
        this.opinionDate = opinionDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
