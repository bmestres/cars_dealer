package domain;

public class SportsCar extends Car{
    double maxSpeedInKmH;

    public SportsCar(String brand, String model, FuelType fuelType, int manufactureYear, double maxSpeedInKmH) {
        super(brand, model, fuelType, manufactureYear);
        this.maxSpeedInKmH = maxSpeedInKmH;
    }

    @Override
    String getDescription() {
        return String.format("Diseñado para quienes viven la carretera intensamente: el %s %s alcanza una " +
                "velocidad máxima de %.2f km/h, combinando elegancia y rendimiento en cada curva");
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f", super.toString(), this.maxSpeedInKmH);
    }
}
