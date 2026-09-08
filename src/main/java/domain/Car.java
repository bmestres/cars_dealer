package domain;

public abstract class Car {

    private String brand;
    private String model;
    private FuelType fuelType;
    private int manufactureYear;

    public Car(String brand, String model, FuelType fuelType, int manufactureYear) {


        if(brand == null){
            throw new IllegalArgumentException("Brand must not be NULL");
        }

        if(brand.isBlank()){
            throw new IllegalArgumentException("Brand must not be empty");
        }

        if(model == null){
            throw new IllegalArgumentException("Model must not be NULL");
        }

        if(model.isBlank()){
            throw new IllegalArgumentException("Model must not be empty");
        }

        if(manufactureYear <= 0){
            throw new IllegalArgumentException("Year of manufacture must not be zero or negative");
        }

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
        return String.format("Brand: %s, Model: %s, Fuel type: %s, Year of manufacture: %d",
                this.brand, this.model, this.fuelType, this.manufactureYear);
    }
}
