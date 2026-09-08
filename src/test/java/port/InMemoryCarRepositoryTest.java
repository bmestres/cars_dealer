package port;

import domain.Car;
import domain.FuelType;
import domain.SportsCar;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    void getAll() {
    }
}