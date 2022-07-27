package web.model;


public class Car {

    private String productionСity;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String productionСity, String model, int series) {
        this.productionСity = productionСity;
        this.model = model;
        this.series = series;
    }

    public String getProductionСity() {
        return productionСity;
    }

    public void setProductionСity(String productionСity) {
        this.productionСity = productionСity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }



}
