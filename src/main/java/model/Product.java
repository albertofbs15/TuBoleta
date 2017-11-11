package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by AHernandezS on 7/11/2017.
 */
@Entity
@Table
public class Product {

    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private Date spectacle_date;
    @Column
    private Date arrival_date;
    @Column
    private int transport_type;
    @Column
    private int spectacle_type;
    @Column
    private int lodging_type;
    @Column
    private String description;
    @Column
    private String code;
    @Column
    private String image_ref;
    @Column
    private String source_city;
    @Column
    private String target_city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSpectacle_date() {
        return spectacle_date;
    }

    public void setSpectacle_date(Date spectacle_date) {
        this.spectacle_date = spectacle_date;
    }

    public Date getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(Date arrival_date) {
        this.arrival_date = arrival_date;
    }

    public int getTransport_type() {
        return transport_type;
    }

    public void setTransport_type(int transport_type) {
        this.transport_type = transport_type;
    }

    public int getSpectacle_type() {
        return spectacle_type;
    }

    public void setSpectacle_type(int spectacle_type) {
        this.spectacle_type = spectacle_type;
    }

    public int getLodging_type() {
        return lodging_type;
    }

    public void setLodging_type(int lodging_type) {
        this.lodging_type = lodging_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage_ref() {
        return image_ref;
    }

    public void setImage_ref(String image_ref) {
        this.image_ref = image_ref;
    }

    public String getSource_city() {
        return source_city;
    }

    public void setSource_city(String source_city) {
        this.source_city = source_city;
    }

    public String getTarget_city() {
        return target_city;
    }

    public void setTarget_city(String target_city) {
        this.target_city = target_city;
    }
}
