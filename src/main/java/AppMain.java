import entity.Car;
import service.CarServiceDao;

import java.util.List;

public class AppMain {


    public static void main(String[] args){
        CarServiceDao carServiceDao = new CarServiceDao();

        Car car = new Car("Logan", "gri");
        carServiceDao.saveCar(car);

        List<Car> cars = carServiceDao.getAllCars();
        cars.forEach(carElem -> System.out.println(carElem.toString()));
    }
}
