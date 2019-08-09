package learnjava.streamdemo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVehicleDemo {

	public static void main(String[] args) {
		List<String> vehicleTypes = Arrays.asList("Car","Aeroplane","Bicycle");
		
		List<Vehicle> vehicles = vehicleTypes.stream().map(str->new Vehicle(str)).collect(Collectors.toList());
		vehicles.forEach(vehicle -> System.out.println("Vehicle is of type:"+vehicle.getType()));

	}

}
