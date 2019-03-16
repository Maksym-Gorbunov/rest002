//package microservices.rest002;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class UserInit {
//    @Bean
//    public CommandLineRunner initDatabase(UserRepository userRepository) {
//        return args -> init(userRepository);
//    }
//
//    public void init(UserRepository userRepository)
//    {
//        userRepository.save(new User("user", "123"));
//
//    }
//}
