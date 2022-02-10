package com.lh.pontointeligente.api;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
class PontoInteligenteApplicationTests {
	
	@Value("${propertiesInfo}")
	private String  propertiesInfo;

	@Test
	public void contextLoads() {
		

		System.out.println("aplicação inicializada - teste "+ propertiesInfo );	
	}

}
