package Matrix2077;

import java.util.ArrayList;
import java.util.List;

public class WorldMap {

    public int width;
    public int height;

    private final List<Entity> world = new ArrayList<>();

    public List<Entity> getWorld() {
        return world;
    }

    public WorldMap(final int width, final int height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                world.add(new Entity(i, j));
            }
        }
    }

    public void addEntity(final Entity entity) {
        int index = entity.getX() * height + entity.getY();
        world.set(index, entity);
    }

    public boolean isEmpty(int index) {
        return world.get(index).getType() == ' ';
    }
}
