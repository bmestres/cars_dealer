package application;

import domain.Car;
import domain.CarRepository;

import java.util.List;

public class ListAllCarsService {
    private CarRepository carsRepository;

    ListAllCarsService(CarRepository repository){
        this.carsRepository = repository;
    }

    List<Car> getAll(){
        return List.copyOf(this.carsRepository.getAll());
    }


}
