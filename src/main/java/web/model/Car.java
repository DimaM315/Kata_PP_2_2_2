package web.model;

public class Car {

    private String model;
    private int region;
    private int series;
    public Car (String model, int series, int region) {
        this.model = model;
        this.series = series;
        this.region = region;
    }
    @Override
    public String toString() {
        return model + ' ' + series + " #" + region;
    }

}
