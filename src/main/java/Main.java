import domain.FuelType;
import domain.Sedan;

public class Main {


    static void main(String[] args) {

        Sedan test = new Sedan("Porche", "MadeUpModel", FuelType.GASOLINE, 2018, 422.12);

        System.out.println(test.toString());

    }
}
