import java.util.List;

public class Route {
    List<String> path;
    int time;

    public Route(List<String> path, int time) {
        this.path = path;
        this.time = time;
    }
    public String toString() {
        return " take " + String.join(", ", path) + " with ETA " + time + " minutes.";
    }
    public int getTime() {
        return time;
    }
}