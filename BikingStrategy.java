import java.util.Arrays;
import java.util.List;

public class BikingStrategy implements Strategy {
    public Route generateRoute(Location a, Location b) {
        // return a biking route from a to b
        List<String> bikeLanes = Arrays.asList("5th St", "W Peachtree St", "10th St", "Peachtree St", "12th St");
        Route bikeRoute = new Route(bikeLanes, 8);
        return bikeRoute;
    }
}