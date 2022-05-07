package Matrix2077.elements.creatures;

import Matrix2077.WorldMap;
import Matrix2077.elements.Creature;

public class Predator extends Creature {

    final int attackPower;

    public Predator(final int x, final int y) {
        super(x, y);
        super.speed = 1;
        super.hp = 100;
        super.type = 'X';
        attackPower = 25;
    }

    @Override
    public void makeMove(final WorldMap worldMap) {

    }
}
