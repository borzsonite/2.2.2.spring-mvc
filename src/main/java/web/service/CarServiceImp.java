package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0 || count >= 5) {
            return carDao.getCarList();
        } else if (count > 0 && count < 6) {
            return carDao.getCarList().stream().limit(count).collect(Collectors.toList());
        }
        return carDao.getCarList();
    }
}
