package Matrix2077.component;

import Matrix2077.model.WorldMap;

public class Predator extends Creature{

    final int attackPower;

    final char type = 'X';

    public Predator(final int x, final int y) {
        super(x, y);
        super.speed = 1;
        super.hp = 100;
        super.setType(type);
        attackPower = 25;
    }

    @Override
    public void makeMove(final WorldMap worldMap) {

    }
}
