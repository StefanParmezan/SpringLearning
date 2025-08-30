package org.StefanParmezan.JpaLearning.services;

import org.StefanParmezan.JpaLearning.models.Car;
import org.StefanParmezan.JpaLearning.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    public CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public void save(String carName){
        Car car = new Car();
        car.setCarName(carName);
        carRepository.save(car);
    }
}
