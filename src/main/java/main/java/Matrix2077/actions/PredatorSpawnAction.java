package main.java.Matrix2077.actions;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.WorldMap;
import main.java.Matrix2077.elements.creatures.Predator;

public class PredatorSpawnAction extends SpawnAction {

    public PredatorSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 90;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Predator(emptyEntity.getX(), emptyEntity.getY());
    }
}