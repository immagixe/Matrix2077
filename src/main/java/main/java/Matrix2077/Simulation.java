package main.java.Matrix2077;

import main.java.Matrix2077.actions.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private final WorldMap worldMap;

    private final DataPrinter dataPrinter;

    private final List<Action> initActions;

    private final List<Action> turnActions;

    private boolean isOver;

    private int countMoves;

    public Simulation(final WorldMap worldMap,
                      final DataPrinter dataPrinter) {
        this.worldMap = worldMap;
        this.dataPrinter = dataPrinter;
        this.initActions = new ArrayList<>();
        this.turnActions = new ArrayList<>();
    }

    public void play() throws InterruptedException {
        createActions ();
        for (final Action action : initActions) {
            action.perform(worldMap);
        }
        while (!isOver) {
            nextTurn();
            Thread.sleep(500);
        }
        System.out.println("Simulation is Over. Number of moves: " + countMoves);
    }

    public void nextTurn() {
        List<Entity> before = new ArrayList<>(worldMap.getWorld());
        for (final Action action : turnActions) {
            action.perform(worldMap);
        }
        List<Entity> after = new ArrayList<>(worldMap.getWorld());
        if (before.equals(after)) {
            this.isOver = true;
        } else {
            dataPrinter.printWorldMap(worldMap);
            countMoves++;
        }
    }

    public void createActions () {
        initActions.add(new RockSpawnAction(worldMap));
        initActions.add(new GrassSpawnAction(worldMap));
        initActions.add(new TreeSpawnAction(worldMap));
        initActions.add(new HerviboreSpawnAction(worldMap));
        initActions.add(new PredatorSpawnAction(worldMap));
        turnActions.add(new MoveCreaturesAction());
        turnActions.add(new GrassSpawnAction(worldMap));
    }
}

