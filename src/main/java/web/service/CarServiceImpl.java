package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        carList = createCarList();
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count <= 0 || count > carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }


    private List<Car> createCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Accord", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Chevrolet", "Camaro", 2022));
        cars.add(new Car("BMW", "X5", 2023));
        return cars;
    }
}
