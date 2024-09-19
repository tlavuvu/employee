package za.co.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.projects.requests.RequestAudit;

@Repository
public interface RequestAuditRepository extends JpaRepository<RequestAudit, Long> {

}//--------------------------------
