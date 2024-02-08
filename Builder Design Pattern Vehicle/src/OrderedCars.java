import java.util.ArrayList;
import java.util.List;

public class OrderedCars {
    List<Car> cars = new ArrayList<Car>();
    public void addCar(Car car){
        cars.add(car);
    }
    public double getCost(){
        double cost=0;
        for (Car car: cars){
            cost+=car.price();
        }
        return cost;
    }
    public void showCars() {
        for (Car car : cars) {
            System.out.println("Car is: " + car.name());
            System.out.println("Price is: "+car.price());
            System.out.println("Brand is: "+car.brand());
        }

    }
}
