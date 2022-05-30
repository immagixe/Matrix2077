package main.java.Matrix2077;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {
        final Simulation simulation = new Simulation(
                new WorldMap(15, 15),
                new DataPrinter());
        simulation.play();
    }
}
