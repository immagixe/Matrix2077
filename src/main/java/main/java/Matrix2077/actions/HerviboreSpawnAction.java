package main.java.Matrix2077.actions;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.WorldMap;
import main.java.Matrix2077.elements.creatures.Hervibore;
import main.java.Matrix2077.elements.objects.Grass;

public class HerviboreSpawnAction extends SpawnAction {

    public HerviboreSpawnAction(WorldMap worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 20;
    }

    @Override
    public void perform(final WorldMap worldMap) {

        int count = 0;
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Hervibore) {
                count++;
            }
        }
        if (count < super.spawnRate / 5) {
            while (count < spawnRate) {
                Entity emptyEntity = getRandomEmptyCell(worldMap);
                Entity newEntityOnMap = spawnEntity(emptyEntity);
                worldMap.setEntity(newEntityOnMap);
                count++;
            }
        }
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Hervibore(emptyEntity.getX(), emptyEntity.getY());
    }
}