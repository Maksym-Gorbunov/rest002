package microservices.rest002;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CarsController {
    Logger logger = LoggerFactory.getLogger(CarsController.class);
    private CarRepository carRepository;
    public CarsController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    //Get all cars from H2 database
    @GetMapping("/cars")
    public List<Car> getAllCars(){
        logger.info("Request for all cars.");
        return carRepository.findAll();
    }

    //Add new car to H2 database
    @PostMapping("/cars")
    public boolean addCar(@RequestBody Car car) {
        logger.info("Request for add car");
        if(!carRepository.existsByLicensenumber(car.getLicensenumber())){
            carRepository.save(new Car(car.getLicensenumber(), car.getMake(), car.getColor()));
            return true;
        } else{
            return false;
        }
    }

    //Delete car from H2 database by licensenumber
    @DeleteMapping("/cars/{licensenumber}")
    public int deleteCar(@PathVariable String licensenumber) {
        logger.info("Request for delete car by licensenumber");
        if(carRepository.existsByLicensenumber(licensenumber)){
            return carRepository.deleteByLicensenumber(licensenumber);
        } else{
            return 0;
        }
    }

    //Find all cars by any field (licensenumber, make, color)
    @GetMapping("/cars/{find}")
    public Car[] findCar(@PathVariable String find) {
        List<Car> cars = new ArrayList<>();
        for(Car car : carRepository.findAll()){
            if(car.getLicensenumber().equals(find) || car.getMake().equals(find) || car.getColor().equals(find)){
                cars.add(car);
            }
        }
        return cars.toArray(new Car[cars.size()]);
    }

    //Info
    @GetMapping("/help")
    public String help() {
        return "This rest microservice is used for storing and retrieving information about cars in H2 database.";
    }
}
