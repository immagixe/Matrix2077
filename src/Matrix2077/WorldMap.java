package Matrix2077;

import java.util.ArrayList;
import java.util.List;

public class WorldMap {

    public int width;
    public int height;

    private final List<Element> world = new ArrayList<>();

    public List<Element> getWorld() {
        return world;
    }

    public WorldMap(final int width, final int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                world.add(new Element(i, j));
            }
        }
    }

    public void addEntity(final Element element) {
        int index = element.getX() * height + element.getY();
        world.set(index, element);
    }

    public boolean isEmpty(int index) {
        return world.get(index).getType() == ' ';
    }
}
