package port;

import domain.Car;
import domain.ListAllCarsQuery;

import java.util.List;

public class CarsRepositoryPrinterService implements ListAllCarsQuery {

    public CarsRepositoryPrinterService() {
    }

    @Override
    public void printAll(List<? extends Car> cars) {
        cars.stream().forEach(car -> {System.out.println(car.toString());});

    }
}
