package microservices.rest002;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import javax.transaction.Transactional;

public interface CarRepository extends JpaRepository<Car, Long> {
    //Check if car exist in H2 database by licensenumber
    boolean existsByLicensenumber(String licencenumber);

    //Delete car by licensenumber from H2 database
    @Transactional
    @Modifying
    int deleteByLicensenumber(String licencenumber);


    //Extra methods, works but not in use now
//    boolean existsByMake(String licencenumber);
//    boolean existsByColor(String licencenumber);
//    Car getByLicensenumber(String licencenumber);
//    Car getByMake(String licencenumber);
//    Car getByColor(String licencenumber);
}
