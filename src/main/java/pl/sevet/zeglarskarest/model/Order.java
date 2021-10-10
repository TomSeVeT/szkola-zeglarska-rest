package pl.sevet.zeglarskarest.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Currency;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private Date orderDate;

    private Currency totalPrice;

    private Boolean paid;

    private Boolean realised;

    private Boolean archival;

    private Long clientId;

    private String remarks;

    private Long updateUserId;

    public Order(Long id, String number, Date orderDate, Currency totalPrice, Boolean paid, Boolean realised, Boolean archival, Long clientId, String remarks, Long updateUserId) {
        this.id = id;
        this.number = number;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.paid = paid;
        this.realised = realised;
        this.archival = archival;
        this.clientId = clientId;
        this.remarks = remarks;
        this.updateUserId = updateUserId;
    }

    public Order(String number,Date orderDate, Currency totalPrice, Boolean paid, Boolean realised, Boolean archival, Long clientId, String remarks, Long updateUserId) {
        this.number = number;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.paid = paid;
        this.realised = realised;
        this.archival = archival;
        this.clientId = clientId;
        this.remarks = remarks;
        this.updateUserId = updateUserId;
    }

    public Order(String number, Date orderDate, Currency totalPrice, Boolean paid, Boolean realised, Boolean archival, Long clientId, String remarks) {
        this.number = number;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.paid = paid;
        this.realised = realised;
        this.archival = archival;
        this.clientId = clientId;
        this.remarks = remarks;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Currency getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Currency totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Boolean getRealised() {
        return realised;
    }

    public void setRealised(Boolean realised) {
        this.realised = realised;
    }

    public Boolean getArchival() {
        return archival;
    }

    public void setArchival(Boolean archival) {
        this.archival = archival;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
