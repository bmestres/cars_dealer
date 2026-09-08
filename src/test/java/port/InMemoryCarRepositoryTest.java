package port;

import domain.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class InMemoryCarRepositoryTest {

    @Test
    void constructWithNullOrEmptyListReturnsException(){

        List<Car> testNullList = null;
        List<Car> testEmptyList = new ArrayList<>();
        List<Car> testOkList = new ArrayList<>(List.of(new SportsCar("TestBrand", "TestModel", FuelType.GASOLINE, 2026, 325.75)));

        assertThrows(IllegalArgumentException.class, ()-> new InMemoryCarRepository(testNullList));
        assertThrows(IllegalArgumentException.class, ()-> new InMemoryCarRepository(testEmptyList));
        assertDoesNotThrow(()-> new InMemoryCarRepository(testOkList));
    }


    @Test
    void getAllMethodShouldReturnExpectedList() {

        List<Car> inputList = new ArrayList<>(List.of(
                new Sedan("BrandName01", "ModelName01", FuelType.ELECTRIC, 2019, 413.47),
                new SportsCar("BrandName02", "ModelName02", FuelType.DIESEL, 2020, 355.31),
                new SUV("BrandName03", "ModelName03", FuelType.GASOLINE, 2024, TractionType._4x2)
        ));

        List<Car> expectedList = new ArrayList<>(List.of(
                new Sedan("BrandName01", "ModelName01", FuelType.ELECTRIC, 2019, 413.47),
                new SportsCar("BrandName02", "ModelName02", FuelType.DIESEL, 2020, 355.31),
                new SUV("BrandName03", "ModelName03", FuelType.GASOLINE, 2024, TractionType._4x2)
        ));

        InMemoryCarRepository carRepositoryTest = new InMemoryCarRepository(inputList);

        assertThat(carRepositoryTest.getAll())
                .usingRecursiveComparison()
                .isEqualTo(expectedList);
    }
}