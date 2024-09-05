package za.co.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.projects.entities.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
