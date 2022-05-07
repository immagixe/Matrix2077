package Matrix2077;

public class DataPrinter {

    public void printWorldMap(final WorldMap worldTile) {
        int borderDrawingLength = worldTile.getWorld().size() / worldTile.getCoordinates().length;
        int borderDrawingLengthOld = borderDrawingLength;
        drawBorders(borderDrawingLength);
        for (int i = 0; i < worldTile.getWorld().size(); i++) {
            System.out.print("| " + worldTile.getWorld().get(i).getType() + " ");
            if (i == borderDrawingLengthOld - 1) {
                System.out.println("|");
                borderDrawingLengthOld += borderDrawingLength;
            }
        }
        drawBorders(borderDrawingLength);
    }

    private void drawBorders(final int borderDrawingLength) {
        System.out.print("|");
        for (int i = 0; i < borderDrawingLength; i++) {
            System.out.print("||||");
        }
        System.out.println();
    }
}
