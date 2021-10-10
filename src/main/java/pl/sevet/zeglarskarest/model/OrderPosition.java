package pl.sevet.zeglarskarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private Long courseId;

    public OrderPosition(Long id, Long orderId, Long courseId) {
        this.id = id;
        this.orderId = orderId;
        this.courseId = courseId;
    }

    public OrderPosition(Long orderId, Long courseId) {
        this.orderId = orderId;
        this.courseId = courseId;
    }

    public OrderPosition() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
