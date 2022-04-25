package com.sal.location.service;


import com.sal.location.model.Location;
import com.sal.location.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location saveLocation(Location location){
        return locationRepository.save(location);
    }

    public Location updateLocation(Location location){
        return locationRepository.save(location);
    }

    public void deleteLocation(long id){
         locationRepository.deleteById(id);
    }

    public Optional<Location> getLocation(long id){
        return locationRepository.findById(id);
    }

    public List<Location> getAllLocation(){
        return locationRepository.findAll();
    }
}
