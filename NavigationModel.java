public class NavigationModel {
    // utilize polymorphism and store a reference to a strategy
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Route startRoute(Location a, Location b) {
        // the file doesn't need to know which strategy is being used
        // the code won't break when a strategy is added, removed, or modified
        return strategy.generateRoute(a, b);
    }
}
