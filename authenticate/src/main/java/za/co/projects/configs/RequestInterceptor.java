package za.co.projects.configs;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor implements HandlerInterceptor{
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) {
		System.out.println(request.getRequestURL());
		
        return true;
    }
	
//	@Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception){
//		System.out.println(object + " 2: " + new Date());
//    }

	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model){
		System.out.println(response.getStatus());
    }
}//-----------------------------
