package com.example.carrentalspringboot.service;

import com.example.carrentalspringboot.dto.VehicleDTO;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;

public interface VehicleService {
    Page<VehicleDTO> getVehicles(final Integer pageNumber, final Integer size);
    VehicleDTO getVehicleById(@PathVariable Integer id);
    VehicleDTO addVehicle(VehicleDTO VehicleDTO);
    void deleteVehicleById(@PathVariable Integer id);
    VehicleDTO updateVehicleById(VehicleDTO VehicleDTO);
}
