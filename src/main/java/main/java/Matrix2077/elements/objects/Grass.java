package main.java.Matrix2077.elements.objects;

import main.java.Matrix2077.Entity;

public class Grass extends Entity {

    public Grass(final int x, final int y) {
        super(x, y);
        super.type = (char) 27 + "[32m\"" + (char)27 + "[0m";
    }
}
