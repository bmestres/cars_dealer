package port;

import domain.Car;
import domain.CarRepository;

import java.util.List;

public class InMemoryCarRepository implements CarRepository {

    private List<Car> cars;
    public InMemoryCarRepository(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getAll() {
        return List.copyOf(this.cars);
    }
}
