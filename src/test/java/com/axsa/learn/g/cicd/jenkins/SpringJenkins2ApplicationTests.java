package com.axsa.learn.g.cicd.jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SpringJenkins2ApplicationTests {
	
	static Logger logger = LoggerFactory.getLogger(SpringJenkins2ApplicationTests.class);

	@Test
	void test() {
		logger.info("Test case executing ...");
		logger.info("Test case executing ...");
		 String expected = "Baeldung";
		    String actual = "Baeldung";

		    assertEquals(expected, actual);
	}

}
