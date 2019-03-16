package microservices.rest002;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(String not_found) {
        super(not_found);
    }
}
