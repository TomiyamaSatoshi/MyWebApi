package jp.co.api.myweb.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Aspect
@Component
public class ControllerLog {
	
	private final static Logger logger = LoggerFactory.getLogger(ControllerLog.class);
	
	@Before("execution(public * jp.co.api.myweb.controller.*Controller.*(..))")
	public void startLog(JoinPoint joinPoint) {
		
		RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)attributes;
		HttpServletRequest request = servletRequestAttributes.getRequest();
		
		logger.info("[start controller]: " + request.getServletPath() + " " + joinPoint.toString());
	}

	@After("execution(public * jp.co.api.myweb.controller.*Controller.*(..))")
	public void endLog(JoinPoint joinPoint) {
		
		RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)attributes;
		HttpServletRequest request = servletRequestAttributes.getRequest();
		
		logger.info("[end controller]: " + request.getServletPath() + " " + joinPoint.toString());
	}

}
