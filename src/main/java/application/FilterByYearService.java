package application;

import domain.Car;
import domain.CarRepository;
import domain.FilterByYearQuery;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByYearService implements FilterByYearQuery {
    private CarRepository cars;

    public FilterByYearService(CarRepository cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> filter(int year) {

        return this.cars
                .getAll()
                .stream()
                .filter(car -> car.getManufactureYear() > year)
                .collect(Collectors.toList());
    }
}
