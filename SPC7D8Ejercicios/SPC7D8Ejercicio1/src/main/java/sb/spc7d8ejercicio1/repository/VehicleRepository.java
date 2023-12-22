package sb.spc7d8ejercicio1.repository;

import org.springframework.stereotype.Repository;
import sb.spc7d8ejercicio1.model.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VehicleRepository {

    List<Vehicle> vehicleList = new ArrayList<>();

    public List<Vehicle>vehicleList(){
        return vehicleList;
    }

}
