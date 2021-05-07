package service;

import config.HibernateConfig;
import entity.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.criteria.internal.expression.SizeOfPluralAttributeExpression;

import java.util.ArrayList;
import java.util.List;


public class CarServiceDao {

    public void saveCar(Car car){
        try {
            Session session = HibernateConfig.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(car);
            transaction.commit();
        } catch (Exception ex) {
            System.out.println();
        }
    }

    public List<Car> getAllCars(){
        List<Car> cars = new ArrayList<>();
        try{
            cars = HibernateConfig.getSessionFactory().openSession().createQuery("from Car", Car.class).list();
        } catch (Exception ex){
            System.out.println(ex);
        }
        return cars;
    }
}
