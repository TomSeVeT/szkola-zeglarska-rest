package pl.sevet.zeglarskarest.model;

import javax.persistence.*;
import java.util.Currency;
import java.util.Date;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Currency price;

    private String briefDescription;

    private String location;

    private String target;

    private String fullDescription;

    private Long courseGroup;

    private Long userId;

    public Course(Long id, String name, Currency price, String briefDescription, String location, String target, String fullDescription, Long courseGroup, Long userId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.briefDescription = briefDescription;
        this.location = location;
        this.target = target;
        this.fullDescription = fullDescription;
        this.courseGroup = courseGroup;
        this.userId = userId;
    }

    public Course(String name, Currency price, String briefDescription, String location, String target, String fullDescription, Long courseGroup, Long userId) {
        this.name = name;
        this.price = price;
        this.briefDescription = briefDescription;
        this.location = location;
        this.target = target;
        this.fullDescription = fullDescription;
        this.courseGroup = courseGroup;
        this.userId = userId;
    }

    public Course() {

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

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public Long getCourseGroup() {
        return courseGroup;
    }

    public void setCourseGroup(Long courseGroup) {
        this.courseGroup = courseGroup;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
