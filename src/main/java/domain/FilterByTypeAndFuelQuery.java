package domain;

import java.util.List;

public interface FilterByTypeAndFuelQuery {
    List<Car> filter(Class <? extends Car> carType, FuelType fuelType);
}
