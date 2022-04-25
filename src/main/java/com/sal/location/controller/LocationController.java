package com.sal.location.controller;

import com.sal.location.model.Location;
import com.sal.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/location")
@CrossOrigin("http://127.0.0.1:5500")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@PostMapping("/")
	public Location saveLocation(@RequestBody Location location) {
		return locationService.saveLocation(location);
	}

	@PutMapping("/")
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable long id) {
		locationService.deleteLocation(id);
	}

	@GetMapping("/{id}")
	public Optional<Location> getLocation(@PathVariable long id) {
		return locationService.getLocation(id);
	}

	@GetMapping("/")
	public ResponseEntity<List<Location>> getAllLocation() {
		return new ResponseEntity<List<Location>>(locationService.getAllLocation(), HttpStatus.OK);
	}
}
