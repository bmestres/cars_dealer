package port;

import domain.Car;

import java.util.List;

public class ConsoleCarPrinter implements ListAllCarsQuery {

    public ConsoleCarPrinter() {
    }
    @Override
    public void printAll(List<? extends Car> cars) {
        cars.stream().forEach(car -> {System.out.println(car.toString());});
    }
}
