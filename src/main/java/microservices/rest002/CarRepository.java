package microservices.rest002;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface CarRepository extends JpaRepository<Car, Long> {
    boolean existsByLicensenumber(String licencenumber);
//    boolean existsByMake(String licencenumber);
//    boolean existsByColor(String licencenumber);

//    Car getByLicensenumber(String licencenumber);
//    Car getByMake(String licencenumber);
//    Car getByColor(String licencenumber);

    @Transactional
    @Modifying
    int deleteByLicensenumber(String licencenumber);
}
