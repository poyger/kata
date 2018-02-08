package cleancode.naming.bad;

import cleancode.naming.Util;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static List<int[]> theList = new ArrayList<>();

    private List<int[]> getThem() {
        List<int[]> list = new ArrayList<>();
        for (int[] i : theList) {
            if (i[0] == 4) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        theList = Util.getCells();
        System.out.println(new Game().getThem());
    }

}
