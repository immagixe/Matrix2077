package Matrix2077.component;

import Matrix2077.model.Element;
import Matrix2077.model.WorldMap;

public abstract class Creature extends Element {

    protected int speed;

    protected int hp;

    public Creature(final int x, final int y) {
        super(x, y);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;
    }

    public abstract void makeMove(WorldMap worldMap);

}

