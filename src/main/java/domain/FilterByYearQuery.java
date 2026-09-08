package domain;

import java.util.List;

public interface FilterByYearQuery {
    List<Car> filter(int year);
}
