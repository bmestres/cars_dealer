package infrastructure;

import domain.Car;
import domain.CarRepository;

import java.util.List;

public class InMemoryCarRepository implements CarRepository {

    private final List<Car> cars;

    public InMemoryCarRepository(List<Car> cars) {

        if(cars == null){
            throw new IllegalArgumentException("List of cars must not be NULL");
        }

        this.cars = cars;
    }

    @Override
    public void add(Car car) {
        this.cars.add(car);
    }

    @Override
    public List<Car> getAll() {
        return List.copyOf(this.cars);
    }
}
