package web.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import web.model.Car;

@Component
public class CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Германия", "БМВ", 5));
        carList.add(new Car("Франция", "Пежо", 5005));
        carList.add(new Car("Англия", "Даймлер", 1));
        carList.add(new Car("Россия", "Зил", 130));
        carList.add(new Car("Италия", "Феррари", 300));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public Car show(String model) {
        return carList.stream().filter(car -> car.getModel() == model).findAny().orElse(null);
    }
}
