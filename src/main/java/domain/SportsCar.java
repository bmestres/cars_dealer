package domain;

public class SportsCar extends Car implements Exportable{
    double maxSpeedInKmH;

    public SportsCar(String brand, String model, FuelType fuelType, int manufactureYear, double maxSpeedInKmH, CarType carType) {
        super(brand, model, fuelType, manufactureYear, carType);

        if(maxSpeedInKmH <= 0){
            throw new IllegalArgumentException("Maximum speed must not be zero or negative");
        }
        this.maxSpeedInKmH = maxSpeedInKmH;
    }

    @Override
    String getDescription() {
        return String.format("Diseñado para quienes viven la carretera intensamente: el %s %s alcanza una " +
                "velocidad máxima de %.2f km/h, combinando elegancia y rendimiento en cada curva");
    }

    @Override
    public String toString() {
        return String.format("%s, Maximum Speed: %.2f", super.toString(), this.maxSpeedInKmH);
    }

    @Override
    public String getExportInfo() {
        return String.format("Exportable car: %s", this.toString());
    }
}
