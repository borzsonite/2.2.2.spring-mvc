package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private static List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car(1L, "Honda", 2020));
        carList.add(new Car(2L, "Toyota", 2019));
        carList.add(new Car(3L, "Mazda", 2018));
        carList.add(new Car(4L, "Kia", 2021));
        carList.add(new Car(5L, "Mercedes", 2012));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }
}
