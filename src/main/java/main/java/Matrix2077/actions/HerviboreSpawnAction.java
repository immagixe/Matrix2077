package main.java.Matrix2077.actions;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.WorldMap;
import main.java.Matrix2077.elements.creatures.Hervibore;

public class HerviboreSpawnAction extends SpawnAction {

    public HerviboreSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 20;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Hervibore(emptyEntity.getX(), emptyEntity.getY());
    }
}