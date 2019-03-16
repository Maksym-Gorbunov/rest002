package microservices.rest002;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.lang.NonNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Car {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue
    private Long  id;
    private @NonNull String licensenumber;
    private @NonNull String make;
    private @NonNull String color;

    public Car() {
    }

    public Car(String licensenumber, String make, String color) {
        this.licensenumber = licensenumber;
        this.make = make;
        this.color = color;
    }
}

