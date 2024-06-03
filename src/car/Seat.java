package car;

public class Seat  implements  Car {
    private String model;
    private String color;
    private  Integer hourPower;
    private String country;


    public Seat(java.lang.String model, java.lang.String color, Integer hourPower, java.lang.String country) {
        this.model = model;
        this.color = color;
        this.hourPower = hourPower;
        this.country = country;
    }

    @java.lang.Override
    public java.lang.String getModel() {
        return getModel();
    }

    @java.lang.Override
    public java.lang.String getColor() {
        return getColor();
    }

    @java.lang.Override
    public java.lang.Integer getHourPower() {
        return getHourPower();
    }

    @java.lang.Override
    public java.lang.String countryProduced() {
        return countryProduced();
    }
}
