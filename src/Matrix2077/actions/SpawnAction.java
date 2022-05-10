package Matrix2077.actions;

import Matrix2077.Entity;
import Matrix2077.WorldMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class SpawnAction extends Action {

    protected int spawnRate;

    protected List<Action> spawnAction = new ArrayList<>();

    @Override
    public void perform(final WorldMap worldMap) {
        int rate = 0;
        while (rate < spawnRate) {
            Entity emptyEntity = getRandomEmptyCell(worldMap);
            Entity newEntityOnMap = spawnEntity(emptyEntity);
            worldMap.addEntity(newEntityOnMap);
            rate += 1;
        }
    }

    private Entity getRandomEmptyCell(final WorldMap worldMap) {
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

