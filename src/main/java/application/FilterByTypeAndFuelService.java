package application;

import domain.Car;
import domain.CarRepository;
import domain.CarType;
import domain.FuelType;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByTypeAndFuelService {

    CarRepository cars;

    public FilterByTypeAndFuelService(CarRepository cars) {
        this.cars = cars;
    }

    public List<Car> filter(CarType carType, FuelType fuelType) {
        return this.cars
                .getAll()
                .stream()
                .filter(car -> car.getCarType() == carType)
                .filter(car -> car.getFuelType() == fuelType)
                .collect(Collectors.toList());
    }
}
