import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Opel", 2006));
        cars.add(new Car("Fiat", 2014));
        cars.add(new Car("Ford", 2004));
        cars.add(new Car("Nissan", 2002));
        cars.add(new Car("Audi", 2000));
        cars.add(new Car("Volkswagen", 2000));
        cars.add(new Car("Volkswagen", 1998));
        cars.add(new Car("Toyota", 2013));
        cars.add(new Car("Honda", 2008));
        cars.add(new Car("Volvo", 2016));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}