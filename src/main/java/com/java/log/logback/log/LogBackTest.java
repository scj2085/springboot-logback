package com.java.log.logback.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogBackTest {
	private static final Logger logger =LoggerFactory.getLogger(LogBackTest.class);
	//在方法中使用日志输出，如
	@RequestMapping(value = "/logTest", method = RequestMethod.GET)
	public void logTest() {
		
		logger.debug("This is a debug message");  
        logger.info("This is an info message");  
        logger.warn("This is a warn message");  
        logger.error("This is an error message"); 
	}
}
