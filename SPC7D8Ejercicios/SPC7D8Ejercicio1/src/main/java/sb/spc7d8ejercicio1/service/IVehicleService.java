package sb.spc7d8ejercicio1.service;

import sb.spc7d8ejercicio1.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    public List<Vehicle> vehicleList();
    public Vehicle createVehicle(Vehicle vehicle);
    public List<Vehicle>listVehiclesIncreases();
    public Vehicle informationById(Long id);
}
