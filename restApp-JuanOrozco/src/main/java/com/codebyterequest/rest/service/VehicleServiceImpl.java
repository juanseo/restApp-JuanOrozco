package com.codebyterequest.rest.service;

import com.codebyterequest.rest.model.Vehicle;
import com.codebyterequest.rest.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Optional<Vehicle> getVehicle(Long id) {
        return Optional.empty();
    }

    @Override
    public Vehicle update(Long id, Vehicle vehicle) {
       Optional<Vehicle> vehicleDb = this.vehicleRepository.findById(vehicle.getId());

       if (vehicleDb.isPresent()){

       }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
