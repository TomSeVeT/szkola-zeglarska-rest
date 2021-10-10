package pl.sevet.zeglarskarest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CourseDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;
    private Long courseId;

    public CourseDate(Long id, Date startDate, Date endDate, Long courseId) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseId = courseId;
    }

    public CourseDate(Date startDate, Date endDate, Long courseId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseId = courseId;
    }


    public CourseDate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
