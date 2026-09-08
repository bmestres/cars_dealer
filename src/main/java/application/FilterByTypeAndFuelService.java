package application;

import domain.Car;
import domain.CarRepository;
import domain.FilterByTypeAndFuelQuery;
import domain.FuelType;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByTypeAndFuelService implements FilterByTypeAndFuelQuery {

    CarRepository cars;

    public FilterByTypeAndFuelService(CarRepository cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> filter(Class <? extends Car> carType, FuelType fuelType) {

        return this.cars
                .getAll()
                .stream()
                .filter(car -> carType.isInstance(car))
                .filter(car -> car.getFuelType() == fuelType)
                .collect(Collectors.toList());
    }
}
