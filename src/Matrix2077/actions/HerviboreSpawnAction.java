package Matrix2077.actions;

import Matrix2077.Entity;
import Matrix2077.WorldMap;
import Matrix2077.elements.creatures.Hervibore;

public class HerviboreSpawnAction extends SpawnAction {

    public HerviboreSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 10;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Hervibore(emptyEntity.getX(), emptyEntity.getY());
    }
}