package port;

import domain.Car;
import domain.CarRepository;

import java.util.List;

public class InMemoryCarRepository implements CarRepository {

    private List<Car> cars;

    public InMemoryCarRepository(List<Car> cars) {

        if(cars == null){
            throw new IllegalArgumentException("List of cars must not be NULL");
        }

        if(cars.isEmpty()){
            throw new IllegalArgumentException("List of cars must not be empty");
        }

        this.cars = cars;
    }

    @Override
    public List<Car> getAll() {
        return List.copyOf(this.cars);
    }
}
