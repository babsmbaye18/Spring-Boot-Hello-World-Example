package com.reytech.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
        void groupedAssertions() {
        Personne pers = new Personne("Nassur", "Moumadi");

        assertAll("personne", () -> assertEquals("Nassur", pers.getFirstName()),
                              () -> assertEquals("Moumadi", pers.getLastName()));
    }


}
