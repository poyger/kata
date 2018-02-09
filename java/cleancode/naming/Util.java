package cleancode.naming;

import cleancode.naming.good.Cell;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<int[]> getCells() {
        List<int[]> cells = new ArrayList<>();
        int[] i1 = { 1, 2};
        int[] i2 = { 2, 2};
        int[] i3 = { 3, 2};
        int[] i4 = { 4, 2};
        cells.add(i1);
        cells.add(i2);
        cells.add(i3);
        cells.add(i4);
        return cells;
    }

    public static List<Cell> getCellsObject() {
        List<Cell> cells = new ArrayList<>();
        cells.add(new Cell(1, 2));
        cells.add(new Cell(2, 2));
        cells.add(new Cell(3, 2));
        cells.add(new Cell(4, 2));
        return cells;
    }
}
