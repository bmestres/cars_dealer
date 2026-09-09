package domain;

import java.util.List;

public interface CarRepository {

    void add(Car car);
    List<Car> getAll();
}
