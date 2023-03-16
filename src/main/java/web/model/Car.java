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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return model + ' ' + series + " #" + region;
    }

}
