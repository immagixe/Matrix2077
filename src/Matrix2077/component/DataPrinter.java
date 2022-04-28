package Matrix2077.component;

import Matrix2077.model.WorldMap;

public class DataPrinter {

    public void printWorldMap(final WorldMap worldTile) {
        int x = worldTile.getWorld().size() / worldTile.getCoordinates().length;
        int xOld = x;
        drawBorders(x);
        for (int i = 0; i < worldTile.getWorld().size(); i++) {
            System.out.print("| " + worldTile.getEntity(worldTile.getWorld().get(i)) + " ");
            if (i == xOld - 1) {
                System.out.println("|");
                xOld += x;
            }
        }
        drawBorders(x);
    }

    private void drawBorders(final int x) {
        System.out.print("|");
        for (int i = 0; i < x; i++) {
            System.out.print("||||");
        }
        System.out.println();
    }
}
