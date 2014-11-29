import com.google.common.collect.Lists;

import java.util.List;

public class MineField {
    private static class Square {
        public boolean isMine = false;
        public int adjacencyCount = 0;

        public String getChar() {
            if (isMine) {
                return "*";
            }
            if (adjacencyCount == 0) {
                return ".";
            }
            return Integer.toString(adjacencyCount);
        }
    }

    private List<Square> locations = Lists.newArrayList();

    public MineField(){
        for (int i = 0; i < 12; i++) {
            locations.add(new Square());
        }
    }

    public void findMines(int mineLoc) {
        setMine(mineLoc);
        printMineField(locations);
    }

    public String getSquare(int i) {
        return locations.get(i).getChar();
    }

    public void setMine(int mineLoc) {
        Square square = locations.get(mineLoc);
        square.isMine = true;
        addHints(mineLoc);
    }

    private void addHints(int mineLoc) {
        if ((mineLoc + 1) % 4 != 0) {
            locations.get(mineLoc + 1).adjacencyCount++;
        }
        if((mineLoc) %4 != 0 && mineLoc>0){
            locations.get(mineLoc - 1).adjacencyCount++;
        }
    }

    private void printMineField(List<Square> locs) {
        System.out.println(locs.get(0).getChar() + locs.get(1).getChar() +  locs.get(2).getChar() +  locs.get(3).getChar());
        System.out.println(locs.get(4).getChar() + locs.get(5).getChar() +  locs.get(6).getChar() +  locs.get(7).getChar());
        System.out.println(locs.get(8).getChar() + locs.get(9).getChar() + locs.get(10).getChar() + locs.get(11).getChar());
    }
}
