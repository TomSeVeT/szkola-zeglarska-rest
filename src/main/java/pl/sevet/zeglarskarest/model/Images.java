package pl.sevet.zeglarskarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelName;

    private String description;

    private byte[] img;

    public Images() {
    }

    public Images(Long id, String modelName, String description, byte[] img) {
        this.id = id;
        this.modelName = modelName;
        this.description = description;
        this.img = img;
    }

    public Images(String modelName, String description, byte[] img) {
        this.modelName = modelName;
        this.description = description;
        this.img = img;
    }

    public Images(String modelName, byte[] img) {
        this.modelName = modelName;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
