package Matrix2077;

import java.util.ArrayList;
import java.util.List;

public class WorldMap {

    private final Element[][] coordinates;
    private final List<Element> world = new ArrayList<>();

    public Element[][] getCoordinates() {
        return coordinates;
    }

    public List<Element> getWorld() {
        return world;
    }

    public WorldMap(final int width, final int height) {
        coordinates = new Element[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                coordinates[i][j] = new Element(i, j);
                world.add(coordinates[i][j]);
            }
        }
    }

    public void addEntity(final Element element) {
        int index = element.getX() * coordinates.length + element.getY();
        world.set(index, element);
    }

    public char getEntity(final Element element) {
        return element.getType();
    }

    public boolean isEmpty(final WorldMap worldMap, int index) {
        return world.get(index).getType() == ' ';
    }
}
