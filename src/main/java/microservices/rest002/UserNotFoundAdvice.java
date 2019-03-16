//package microservices.rest002;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ControllerAdvice
//public class UserNotFoundAdvice {
//    @ExceptionHandler(CarNotFoundException.class)
//    @ResponseBody
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    String productNotFound(UserNotFoundException exception) {
//        return exception.getMessage();
//    }
//}
