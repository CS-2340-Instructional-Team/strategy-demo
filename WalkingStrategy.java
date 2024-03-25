import java.util.Arrays;
import java.util.List;

public class WalkingStrategy implements Strategy {
    public Route generateRoute(Location a, Location b) {
        // return a walking route from a to b
        List<String> sidewalks = Arrays.asList("5th St", "W Peachtree St", "8th St", "Piedmont Ave", "12th St");
        Route walkingRoute = new Route(sidewalks, 20);
        return walkingRoute;
    }
}