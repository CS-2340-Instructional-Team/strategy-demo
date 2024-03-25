import java.util.Arrays;
import java.util.List;

public class DrivingStrategy implements Strategy {
    public Route generateRoute(Location a, Location b) {
        // return a driving route from a to b
        List<String> roads = Arrays.asList("5th St", "Peachtree St", "10th St", "Piedmont Ave");
        Route drivingRoute = new Route(roads, 5);
        return drivingRoute;
    }
}