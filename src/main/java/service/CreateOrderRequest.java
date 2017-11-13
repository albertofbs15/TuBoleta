package service;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by AHernandezS on 13/11/2017.
 */
@XmlRootElement
public class CreateOrderRequest implements Serializable{

    private int id;
    private Date arrivalDate;
    private Date departureDate;
    private int sourceCity;
    private int targetCity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(int sourceCity) {
        this.sourceCity = sourceCity;
    }

    public int getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(int targetCity) {
        this.targetCity = targetCity;
    }
}
