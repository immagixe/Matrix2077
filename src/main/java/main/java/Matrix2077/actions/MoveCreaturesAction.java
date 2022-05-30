package main.java.Matrix2077.actions;

import main.java.Matrix2077.WorldMap;
import main.java.Matrix2077.elements.Creature;

public class MoveCreaturesAction extends Action {

    @Override
    public void perform(final WorldMap worldMap) {
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Creature)
                ((Creature) worldMap.getEntity(i)).setAlreadyMove(false);
        }
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Creature &&
                    !((Creature) worldMap.getEntity(i)).isAlreadyMove()) {
                ((Creature) worldMap.getEntity(i)).setAlreadyMove(true);
                ((Creature) worldMap.getEntity(i)).makeMove(worldMap);
            }
        }
    }
}
