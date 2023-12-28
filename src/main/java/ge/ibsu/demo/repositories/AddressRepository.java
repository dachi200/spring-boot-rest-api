package ge.ibsu.demo.repositories;

import ge.ibsu.demo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AddressRepository extends JpaRepository<Address,Long> {
    Address findOneByAddress(String address);

    Address findOneByAddressAndPostalCode(String a,String b);

    List<Address> findAllByPostalCode(String a);

}
