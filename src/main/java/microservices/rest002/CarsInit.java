package microservices.rest002;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarsInit {

    @Bean
    public CommandLineRunner initDatabase(CarRepository repository) {
        return args -> init(repository);
    }

    public void init(CarRepository repository)
    {
        repository.save(new Car("sui076", "honda", "blue"));
        repository.save(new Car("mks756", "volvo", "green"));
        repository.save(new Car("sgd865", "saab", "black"));
        repository.save(new Car("jsd023", "toyota", "blue"));
        repository.save(new Car("dww566", "nissan", "orange"));
        repository.save(new Car("skd999", "ford", "blue"));
    }
}
