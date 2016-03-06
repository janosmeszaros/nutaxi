package com.msteam;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleCassandraProjectApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class SampleCassandraProjectApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {
		assertNotNull(context);
	}

}
