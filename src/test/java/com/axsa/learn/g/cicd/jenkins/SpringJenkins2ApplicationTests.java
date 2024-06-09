package com.axsa.learn.g.cicd.jenkins;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkins2ApplicationTests {
	
	static Logger logger = LoggerFactory.getLogger(SpringJenkins2ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing ...");
		logger.info("Test case executing ...");
		// assertEquals(true, true);
	}

}
