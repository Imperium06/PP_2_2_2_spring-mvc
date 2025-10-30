package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Tesla", "Red", 30000));
        cars.add(new Car("Honda", "Yellow", 40000));
        cars.add(new Car("Audi", "Blue", 50000));
        cars.add(new Car("Mercedes", "Green", 60000));
        cars.add(new Car("BMW", "Blue", 70000));
        cars.add(new Car("Bentley", "Yellow", 80000));
    }

    @Override
    public List<Car> getCars(int count) {
        return count < 5 ? cars.stream().toList().subList(0, count) : cars;
    }

}
