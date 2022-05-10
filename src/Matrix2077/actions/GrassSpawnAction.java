package Matrix2077.actions;

import Matrix2077.Entity;
import Matrix2077.WorldMap;
import Matrix2077.elements.objects.Grass;

public class GrassSpawnAction extends SpawnAction {

    public GrassSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 5;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Grass(emptyEntity.getX(), emptyEntity.getY());
    }
}
