package za.co.projects.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.projects.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByUsername(String username);
	Optional<Employee> findByEmail(String email);
	Optional<Employee> findByIdnumber(String idnumber);
}
