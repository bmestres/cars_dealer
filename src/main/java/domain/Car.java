package domain;

public abstract class Car {

    private String brand;
    private String model;
    private FuelType fuelType;
    private int manufactureYear;

    public Car(String brand, String model, FuelType fuelType, int manufactureYear) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.manufactureYear = manufactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    abstract String getDescription();

    public String toString() {
        return String.format("Brand: %s, Model: %s, Fuel type: %s, Year of manufacture: %s",
                this.brand, this.model, this.fuelType, this.manufactureYear);
    }
}
