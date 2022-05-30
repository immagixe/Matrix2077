package main.java.Matrix2077.actions;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.WorldMap;
import java.util.Random;

public abstract class SpawnAction extends Action {

    protected int spawnRate;

    @Override
    public void perform(final WorldMap worldMap) {

        int rate = 0;
        while (rate < spawnRate) {
            Entity emptyEntity = getRandomEmptyCell(worldMap);
            Entity newEntityOnMap = spawnEntity(emptyEntity);
            worldMap.setEntity(newEntityOnMap);
            rate++;
        }
    }

    public Entity getRandomEmptyCell(final WorldMap worldMap) {
        while (true) {
            int x = new Random().nextInt(worldMap.width - 1);
            int y = new Random().nextInt(worldMap.height - 1);
            int index = x * worldMap.height + y;
            if (worldMap.isEmpty(index)) {
                return new Entity(x, y);
            }
        }
    }

    public abstract Entity spawnEntity(final Entity emptyEntity);
}

