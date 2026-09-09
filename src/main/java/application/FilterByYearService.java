package application;

import domain.Car;
import domain.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByYearService {
    private final CarRepository cars;

    public FilterByYearService(CarRepository cars) {
        this.cars = cars;
    }

    public List<Car> filter(int year) {

        return this.cars
                .getAll()
                .stream()
                .filter(car -> car.getManufactureYear().getValue() > year)
                .collect(Collectors.toList());
    }
}
