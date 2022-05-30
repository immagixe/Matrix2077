package main.java.Matrix2077.elements.creatures;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.elements.Creature;
import main.java.Matrix2077.elements.objects.Grass;
import main.java.Matrix2077.elements.objects.Rock;
import main.java.Matrix2077.elements.objects.Tree;

public class Predator extends Creature {

    final int attackPower;

    public Predator(final int x, final int y) {
        super(x, y);
        super.speed = 1;
        super.hp = 100;
        super.type = (char) 27 + "[31mX" + (char)27 + "[0m";;
        attackPower = 25;
    }

    @Override
    public boolean notAllowedEntitiesToPass(Entity entity) {
        if (entity instanceof Grass ||
                entity instanceof Rock ||
                entity instanceof Tree ||
                entity instanceof Predator) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected boolean checkIfTarget(final Entity entity) {
        return entity instanceof Hervibore;
    }
}
