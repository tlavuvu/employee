package za.co.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.projects.responses.ResponseAudit;

public interface ResponseAuditRepository extends JpaRepository<ResponseAudit, Long> {

}
