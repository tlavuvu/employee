package za.co.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.projects.entities.EmployeeLeave;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, Long>{

}
