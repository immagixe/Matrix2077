package Matrix2077.actions;

import Matrix2077.Entity;
import Matrix2077.WorldMap;
import Matrix2077.elements.objects.Rock;

public class RockSpawnAction extends SpawnAction {

    public RockSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height)/20;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Rock(emptyEntity.getX(), emptyEntity.getY());
    }
}
