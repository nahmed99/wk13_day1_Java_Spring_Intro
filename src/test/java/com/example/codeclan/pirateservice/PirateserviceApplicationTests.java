package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository; // access an instance of PirateRepository

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSavePirate(){
		// create pirate
		Pirate pirate = new Pirate("Jack", "Sparrow", 33);

		// get hold of pirate repository and save a pirate object.
		pirateRepository.save(pirate);

		// don't need an assert in this case - it is being used illustrate a point.

	}

}
