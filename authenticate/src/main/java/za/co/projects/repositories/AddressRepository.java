package za.co.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.projects.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
