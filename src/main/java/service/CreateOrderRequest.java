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
    private Date spectacleDate;
    private int targetCity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSpectacleDate() {
        return spectacleDate;
    }

    public void setSpectacleDate(Date spectacleDate) {
        this.spectacleDate = spectacleDate;
    }

    public int getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(int targetCity) {
        this.targetCity = targetCity;
    }
}
