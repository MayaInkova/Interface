package car;

import java.io.Serializable;

public interface Car extends Serializable {
    int TYRES = 4;
    public String getModel();
     public String getColor();
    public Integer getHourPower();
     public  String countryProduced();


}
