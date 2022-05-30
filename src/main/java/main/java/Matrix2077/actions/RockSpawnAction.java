package main.java.Matrix2077.actions;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.WorldMap;
import main.java.Matrix2077.elements.objects.Rock;

public class RockSpawnAction extends SpawnAction {

    public RockSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height)/10;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Rock(emptyEntity.getX(), emptyEntity.getY());
    }
}
