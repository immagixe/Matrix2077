package main.java.Matrix2077.elements.creatures;

import main.java.Matrix2077.Entity;
import main.java.Matrix2077.elements.Creature;
import main.java.Matrix2077.elements.objects.Grass;
import main.java.Matrix2077.elements.objects.Rock;
import main.java.Matrix2077.elements.objects.Tree;

public class Hervibore extends Creature {

    public Hervibore(final int x, final int y) {
        super(x, y);
        super.speed = 2;
        super.hp = 100;
        super.type = (char) 27 + "[34m0" + (char)27 + "[0m";
    }

    @Override
    public boolean notAllowedEntitiesToPass(Entity entity) {
        if (entity instanceof Hervibore ||
                entity instanceof Rock ||
                entity instanceof Tree ||
                entity instanceof Predator) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean checkIfTarget(final Entity entity) {
        return entity instanceof Grass;
    }
}