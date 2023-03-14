package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements  CarDao {
    private final List<Car> carList = new ArrayList<>();
    public CarDaoImpl() {
        carList.add(new Car("Oka", 33115, 66));
        carList.add(new Car("Lada", 1683, 66));
        carList.add(new Car("Niva", 4229, 115));
        carList.add(new Car("Reno", 7746, 218));
        carList.add(new Car("Polo", 14653, 218));
    }
    @Override
    public List<Car> getCarList() {
        return carList;
    }
}
