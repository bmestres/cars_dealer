package infrastructure;

import domain.*;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class InMemoryCarRepositoryTest {

    @Test
    void constructWithNullListReturnsException(){

        List<Car> testNullList = null;
        List<Car> testOkList = new ArrayList<>(List.of(new SportsCar("TestBrand", "TestModel", FuelType.GASOLINE, Year.of(2026), 325.75, CarType.SPORTS_CAR)));

        assertThrows(IllegalArgumentException.class, ()-> new InMemoryCarRepository(testNullList));
        assertDoesNotThrow(()-> new InMemoryCarRepository(testOkList));
    }


    @Test
    void getAllMethodShouldReturnExpectedList() {

        List<Car> inputList = new ArrayList<>(List.of(
                new Sedan("BrandName01", "ModelName01", FuelType.ELECTRIC, Year.of(2019), 413.47, CarType.SEDAN),
                new SportsCar("BrandName02", "ModelName02", FuelType.DIESEL, Year.of(2020), 355.31, CarType.SPORTS_CAR),
                new SUV("BrandName03", "ModelName03", FuelType.GASOLINE, Year.of(2024), TractionType._4x2, CarType.SUV)
        ));

        List<Car> expectedList = new ArrayList<>(List.of(
                new Sedan("BrandName01", "ModelName01", FuelType.ELECTRIC, Year.of(2019), 413.47, CarType.SEDAN),
                new SportsCar("BrandName02", "ModelName02", FuelType.DIESEL, Year.of(2020), 355.31, CarType.SPORTS_CAR),
                new SUV("BrandName03", "ModelName03", FuelType.GASOLINE, Year.of(2024), TractionType._4x2, CarType.SUV)
        ));

        InMemoryCarRepository carRepositoryTest = new InMemoryCarRepository(inputList);

        assertThat(carRepositoryTest.getAll())
                .usingRecursiveComparison()
                .isEqualTo(expectedList);
    }
}
