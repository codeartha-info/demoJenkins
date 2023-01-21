package com.example.demoJenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(DemoJenkinsApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("test started");
	}

}
