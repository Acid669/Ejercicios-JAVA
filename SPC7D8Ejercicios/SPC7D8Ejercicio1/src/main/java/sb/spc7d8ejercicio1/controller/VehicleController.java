package sb.spc7d8ejercicio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sb.spc7d8ejercicio1.model.Vehicle;
import sb.spc7d8ejercicio1.service.IVehicleService;

import java.util.List;

@RestController
@RequestMapping("api/vehicles")
public class VehicleController {
    @Autowired
    private IVehicleService vehicleService;

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        vehicleService.createVehicle(vehicle);
        return vehicle;
    }

    @GetMapping
    public List<Vehicle> vehicleList(){
       return vehicleService.vehicleList();
    }
    @GetMapping("/prices")
    public List<Vehicle> listVehiclesIncreases(){
        return vehicleService.listVehiclesIncreases();
    }

    @GetMapping("/{id}")
    public Vehicle informationById(@PathVariable Long id){
        return vehicleService.informationById(id);
    }
}
