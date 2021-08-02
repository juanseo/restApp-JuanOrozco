package com.codebyterequest.rest.service;

import com.codebyterequest.rest.model.Vehicle;
import java.util.Optional;

public interface VehicleService {

    Vehicle save (Vehicle vehicle);

    Optional<Vehicle> getVehicle( Long id);

    Vehicle update(Long id, Vehicle vehicle);

    boolean delete(Long id);
}
