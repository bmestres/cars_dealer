package domain;

public class Sedan extends Car{
    private double trunkCapacityInL;

    public Sedan(String brand, String model, FuelType fuelType, int manufactureYear, double trunkCapacityInL) {
        super(brand, model, fuelType, manufactureYear);
        this.trunkCapacityInL = trunkCapacityInL;
    }

    public double getTrunkCapacityInL() {
        return trunkCapacityInL;
    }

    @Override
    public String toString() {
        return String.format("%s, Trunk Capacity: %.2f", super.toString(), this.trunkCapacityInL);
    }

    @Override
    String getDescription() {
        return String.format("Con su espacionso maletero de %.2f litros y un diseño pensado para el confort, el %s %s " +
                "es el compañero ideal para viajes familiares y trayectos diarios con estilo",
                this.trunkCapacityInL, super.getBrand(), super.getModel());
    }
}
