package za.co.projects.configs;

import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import za.co.projects.requests.RequestAudit;
import za.co.projects.responses.ResponseAudit;
import za.co.projects.services.RequestResponseAuditService;

@Component
public class RequestInterceptor implements HandlerInterceptor{
	
//	@Autowired
//	private RequestResponseAuditService requestResponseAuditService;
//	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws IOException {
		RequestResponseAuditService requestResponseAuditService = new RequestResponseAuditService();
		String uniqueID = UUID.randomUUID().toString();
		RequestAudit requestAudit = new RequestAudit();
		requestAudit.setUrl(request.getRequestURL().toString());
		requestAudit.setStatusCode(0);
		requestAudit.setMethod(request.getMethod());
		requestAudit.setDate(new java.sql.Date(0));
		requestAudit.setUniqueID(uniqueID);
		requestResponseAuditService.saveRequestAudit(requestAudit);
		HttpSession session = request.getSession();
		session.setAttribute("uniqueID", uniqueID);
        return true;
    }
	
//	@Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception){
//		System.out.println(object + " 2: " + new Date());
//    }

	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model){
		RequestResponseAuditService requestResponseAuditService = new RequestResponseAuditService();
		ResponseAudit responseAudit = new ResponseAudit();
		HttpSession session = request.getSession();
		responseAudit.setUrl(request.getRequestURL().toString());
		responseAudit.setStatusCode(response.getStatus());
		responseAudit.setMethod(request.getMethod());
		responseAudit.setDate(new java.sql.Date(0));
		responseAudit.setUniqueID(session.getAttribute("uniqueID").toString());
		requestResponseAuditService.saveResponseAudit(responseAudit);
    }
}//-----------------------------
