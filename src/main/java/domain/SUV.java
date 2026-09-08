package domain;

public class SUV extends Car {
    private TractionType tractionType;

    public SUV(String brand, String model, FuelType fuelType, int manufactureYear, TractionType suspensionType) {
        super(brand, model, fuelType, manufactureYear);
        this.tractionType = suspensionType;
    }

    @Override
    String getDescription() {
        return String.format("El %s %s, con tracción %s, es un SUV que no teme salir del asfalto. " +
                "Perfecto para aventuras al aire libre, terrenos difíciles y escapadas de fin de semana con potencia " +
                "y seguridad", super.getBrand(), super.getModel(), this.tractionType);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), this.tractionType);
    }
}
