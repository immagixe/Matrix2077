package Matrix2077.component;

import Matrix2077.model.WorldMap;

public class Hervibore extends Creature {

    final char type = 'ꭥ';

    public Hervibore(final int x, final int y) {
        super(x, y);
        super.speed = 2;
        super.hp = 100;
        super.setType(type);
    }

    @Override
    public void makeMove(final WorldMap worldMap) {

    }

    public void makeMove() {

    }
}
