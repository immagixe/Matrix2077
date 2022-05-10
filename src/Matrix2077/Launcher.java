package Matrix2077;

public class Launcher {

    public static void main(String[] args) {
        final Simulation simulation = new Simulation(new WorldMap(10, 10), new DataPrinter());
        simulation.play();
    }
}


