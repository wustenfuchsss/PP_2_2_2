package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private final List<Car> cars;

    public CarDAO() {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", "Vesta", "Pink"));
        cars.add(new Car("KIA", "Rio", "White"));
        cars.add(new Car("Chevrolet", "Cobalt", "Grey"));
        cars.add(new Car("Ford", "Focus", "Blue"));
        cars.add(new Car("Hyundai", "Solaris", "Black"));
    }

    public List<Car> cars() {
        return cars;
    }
}
