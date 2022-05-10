package Matrix2077.actions;

import Matrix2077.Entity;
import Matrix2077.WorldMap;
import Matrix2077.elements.objects.Tree;

public class TreeSpawnAction extends SpawnAction {

    public TreeSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height)/20;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Tree(emptyEntity.getX(), emptyEntity.getY());
    }
}