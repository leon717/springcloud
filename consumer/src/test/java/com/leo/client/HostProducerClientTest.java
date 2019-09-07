package com.leo.client;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HostProducerClientTest {

	@Autowired
	private HostProducerClient producerClient;

	@Test
	public void testPost() {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", "123");
		map.put("state", "accept");
		Object result = producerClient.post(map);
		assertEquals(map, result);
	}

}
