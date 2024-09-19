package za.co.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.projects.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
