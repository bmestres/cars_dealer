package application;

import domain.*;
import org.junit.jupiter.api.Test;
import port.InMemoryCarRepository;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterByYearServiceTest {

   @Test
    void filterMethodShouldReturnExpectedList() {

        List<Car> carsTestList = new ArrayList<>(List.of(
                new Sedan("SedanBrand", "SedanModel", FuelType.DIESEL, 1999, 675.88),
                new SportsCar("Porche", "MadeUpModel", FuelType.GASOLINE, 2018, 422.12),
                new SUV("Toyota", "B5630", FuelType.ELECTRIC, 2004, TractionType._4x2)
        ));


        List<Car> carsExpectedList = new ArrayList<Car>(List.of(
                new SportsCar("Porche", "MadeUpModel", FuelType.GASOLINE, 2018, 422.12)
        ));

        CarRepository carsRepositoryTest = new InMemoryCarRepository(carsTestList);
        FilterByYearService filterServiceTest = new FilterByYearService(carsRepositoryTest);
        assertThat(filterServiceTest.filter(2004)).usingRecursiveComparison().isEqualTo(carsExpectedList);

    }
}