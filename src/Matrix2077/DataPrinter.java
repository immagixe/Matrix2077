package Matrix2077;

public class DataPrinter {

    public void printWorldMap(final WorldMap GameMap) {
        int borderDrawingLength = GameMap.getWorld().size() / GameMap.height;
        int borderDrawingLengthOld = borderDrawingLength;
        drawBorders(borderDrawingLength);
        for (int i = 0; i < GameMap.getWorld().size(); i++) {
            System.out.print("| " + GameMap.getWorld().get(i).getType() + " ");
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
