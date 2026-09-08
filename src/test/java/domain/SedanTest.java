package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SedanTest {

    @ParameterizedTest
    @CsvSource(value = {
            "null, ModeloTest, 2002, 85,74",
            ", ModelTest, 2002, 85,74",
            "BrandTest, null, 2002, 85,74",
            "BrandTest,, 2002, 85,74",
            "BrandTest, ModeloTest, -5, 85,74",
            "BrandTest, ModeloTest, 0, 85,74",
            "BrandTest, ModeloTest, 2015, -25,84",
            "BrandTest, ModeloTest, 2015, 0"
    }, nullValues = {"null"})
    void constructorWithWrongParametersShouldThrowException(String brand, String model, int manufactureYear, double trunkCapacity){
        assertThrows(IllegalArgumentException.class, ()-> new Sedan(brand, model, FuelType.DIESEL, manufactureYear, trunkCapacity, CarType.SEDAN));
        assertDoesNotThrow(()-> new Sedan("OkBrand", "OkModel", FuelType.GASOLINE, 2022, 702.98, CarType.SEDAN));
    }

    @Test
    void testToStringShouldReturnExpectedString() {
        Sedan testSedan01 = new Sedan("TestBrand", "TestModel", FuelType.ELECTRIC, 2025, 818.71, CarType.SEDAN);
        assertEquals("Brand: TestBrand, Model: TestModel, Fuel type: ELECTRIC, Year of manufacture: 2025, Trunk Capacity: 818,71",
                testSedan01.toString());

    }

    @Test
    void getDescriptionShouldReturnExpectedString() {

        Sedan testSedan02 = new Sedan("TestBrand", "TestModel", FuelType.ELECTRIC, 2025, 818.71, CarType.SEDAN);
        assertEquals("Con su espacioso maletero de 818,71 litros y un diseño pensado para el confort, el TestBrand TestModel" +
                " es el compañero ideal para viajes familiares y trayectos diarios con estilo", testSedan02.getDescription());
    }
}