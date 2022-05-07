package Matrix2077.elements.creatures;

import Matrix2077.WorldMap;
import Matrix2077.elements.Creature;

public class Hervibore extends Creature {

    public Hervibore(final int x, final int y) {
        super(x, y);
        super.speed = 2;
        super.hp = 100;
        super.type = 'ꭥ';
    }

    @Override
    public void makeMove(final WorldMap worldMap) {

    }
}
