package infrastructure;

import domain.Car;

import java.util.List;

public class ConsoleCarPrinter {

    public ConsoleCarPrinter() {
    }

    public void printAll(List<? extends Car> cars) {
        cars.stream().forEach(car -> {System.out.println(car.toString());});
    }
}
