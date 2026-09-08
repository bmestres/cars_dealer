package domain;

import java.util.List;

public interface ListAllCarsQuery {
    void printAll(List<? extends Car> cars);
}
