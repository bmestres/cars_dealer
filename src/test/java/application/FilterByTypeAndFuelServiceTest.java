package application;

import domain.*;
import org.junit.jupiter.api.Test;
import infrastructure.InMemoryCarRepository;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class FilterByTypeAndFuelServiceTest {

    @Test
    void outputListShouldMatchExpected() {
        List<Car> testCarList = new ArrayList<Car>(List.of(
                new SportsCar("BrandName01", "ModelName01", FuelType.GASOLINE, 2018, 414.12, CarType.SPORTS_CAR),
                new SportsCar("BrandName02", "ModelName02", FuelType.DIESEL, 2020, 309.22, CarType.SPORTS_CAR),
                new Sedan("BrandName03", "ModelName03", FuelType.ELECTRIC, 2012, 265.55, CarType.SEDAN),
                new Sedan("BrandName04", "ModelName04", FuelType.GASOLINE, 2025, 513.97, CarType.SEDAN),
                new SUV("BrandName05", "ModelName05", FuelType.DIESEL, 2020, TractionType._4x4, CarType.SUV),
                new SportsCar("BrandName06", "ModelName06", FuelType.DIESEL, 2019, 445.63, CarType.SPORTS_CAR)
        ));

        List<Car> expectedCarList = new ArrayList<Car>(List.of(
                new SportsCar("BrandName02", "ModelName02", FuelType.DIESEL, 2020, 309.22, CarType.SPORTS_CAR),
                new SportsCar("BrandName06", "ModelName06", FuelType.DIESEL, 2019, 445.63, CarType.SPORTS_CAR)
        ));

        InMemoryCarRepository carsRepository = new InMemoryCarRepository(testCarList);
        FilterByTypeAndFuelService testFilter = new FilterByTypeAndFuelService(carsRepository);

        assertThat(expectedCarList)
                .usingRecursiveComparison()
                .isEqualTo(testFilter.filter(CarType.SPORTS_CAR, FuelType.DIESEL));

    }
}