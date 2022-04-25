package com.sal.location;

import com.sal.location.model.Location;
import com.sal.location.service.LocationService;
import com.sal.location.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}

	@Autowired
	private LocationService locationService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Bismillah");

		Location location = new Location(0, Status.OCCUPIED.toString(), 10);

		Location locationDb = locationService.saveLocation(location);

		System.out.println(	locationService.getAllLocation());

	}
}
