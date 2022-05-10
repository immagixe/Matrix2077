package Matrix2077;

import Matrix2077.actions.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private final WorldMap worldMap;

    private final DataPrinter dataPrinter;

    public Simulation(final WorldMap worldMap,
                      final DataPrinter dataPrinter) {
        this.worldMap = worldMap;
        this.dataPrinter = dataPrinter;
    }

    public void play() {

        final List<Action> spawnAction = new ArrayList<>();

        spawnAction.add(new RockSpawnAction(worldMap));
        spawnAction.add(new GrassSpawnAction(worldMap));
        spawnAction.add(new TreeSpawnAction(worldMap));
        spawnAction.add(new HerviboreSpawnAction(worldMap));
        spawnAction.add(new PredatorSpawnAction(worldMap));

        for (final Action action : spawnAction) {
            action.perform(worldMap);
        }

        System.out.println("Welcome to world simulation \"Matrix 2077\"");
        System.out.println("▲ - rock, ᛉ - tree, ✶ - grass");
        System.out.println("ꭥ - hervibore, X - predator");
        dataPrinter.printWorldMap(worldMap);
    }
}

