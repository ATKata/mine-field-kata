import com.google.common.collect.Lists;

import java.util.List;

public class MineField {

    private List<String> locations;

    public void findMines(int mineLoc) {
        locations = createLocs();
        setMines(mineLoc);
        printMineField(locations);
    }

    private List<String> createLocs() {
        List<String> locs = Lists.newArrayList();
        for (int i = 0; i < 12; i++) {
            locs.add(".");
        }
        return locs;
    }

    private void setMines(int mineLoc) {
        locations.set(mineLoc - 1, "*");
    }

    private void printMineField(List<String> locs) {
        System.out.println(locs.get(0) + locs.get(1) + locs.get(2) + locs.get(3));
        System.out.println(locs.get(4) + locs.get(5) + locs.get(6) + locs.get(7));
        System.out.println(locs.get(8) + locs.get(9) + locs.get(10) + locs.get(11));
    }

}
