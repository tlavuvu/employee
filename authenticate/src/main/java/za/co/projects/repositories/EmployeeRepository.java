package za.co.projects.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.projects.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByUsername(String username);
	Optional<Employee> findByEmail(String email);
	Optional<Employee> findByIdnumber(String idnumber);
}
