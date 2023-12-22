package sb.spc7d8ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sb.spc7d8ejercicio1.model.Vehicle;
import sb.spc7d8ejercicio1.repository.VehicleRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService implements IVehicleService{
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> vehicleList() {
        return vehicleRepository.vehicleList();
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        vehicle.setId((long) (vehicleRepository.vehicleList().size()+1));
        vehicleRepository.vehicleList().add(vehicle);
        return vehicle;
    }

    @Override
    public List<Vehicle> listVehiclesIncreases() {
        return vehicleRepository.vehicleList().stream()
                .sorted(Comparator.comparing(Vehicle::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public Vehicle informationById(Long id) {
        return vehicleRepository.vehicleList().stream()
                .filter(vehicle -> vehicle.getId().equals(id))
                .findFirst().orElse(null);
    }
}
