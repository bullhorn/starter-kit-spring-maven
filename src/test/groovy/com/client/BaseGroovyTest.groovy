package com.client

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.client.core.base.tools.test.TestEntities

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = [ "/applicationContext.xml","classpath*:/*-workflow.xml","classpath*:/*-config.xml","classpath*:/*-scheduledtasks.xml", "classpath*:/*-applicationContext.xml", "/applicationContext-test.xml" ])
class BaseGroovyTest extends GroovyTestCase {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	TestEntities testEntities;

	@Test
	public void testApplicationContextSetup() {
		assertNotNull(applicationContext);
	}

	/**
	 * Returns the container of bullhorn test entities
	 * 
	 * @return
	 */
	public TestEntities getTestEntities() {
		return testEntities;
	}

}
