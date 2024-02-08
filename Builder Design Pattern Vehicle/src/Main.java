import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OrderBuilder builder = new OrderBuilder();
        OrderedCars cars = builder.orderedCars();
        cars.showCars();

        System.out.println("\n");
        System.out.println("Total Cost: "+cars.getCost());
    }
}
