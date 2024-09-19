package za.co.projects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.projects.repositories.RequestAuditRepository;
import za.co.projects.repositories.ResponseAuditRepository;
import za.co.projects.requests.RequestAudit;
import za.co.projects.responses.ResponseAudit;

@Service
public class RequestResponseAuditService {
	
	@Autowired(required = true)
	private RequestAuditRepository requestAuditRepository;
	
	@Autowired(required = true)
	private ResponseAuditRepository responseAuditRepository;
	
	public void saveRequestAudit(RequestAudit requestAudit) {
		requestAuditRepository.save(requestAudit);
	}
	
	public void saveResponseAudit(ResponseAudit responseAudit) {
		responseAuditRepository.save(responseAudit);
	}
	

}//--------------------------------
