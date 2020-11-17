package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.service.CompactDisc;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired//自动装配
	private CompactDisc cd;

	@org.junit.Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
		cd.play();
	}

}
