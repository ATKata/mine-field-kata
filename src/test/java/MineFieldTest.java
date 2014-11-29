import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MineFieldTest {

    @Test
    public void shouldCreateEmptyMinefield() {
        MineField mineField = new MineField();
        assertEquals(".", mineField.getSquare(0));
    }

    @Test
    public void shouldCreateMinefield() throws Exception {
        MineField mineField = new MineField();
        mineField.setMine(0);
        assertEquals("*", mineField.getSquare(0));
    }

    @Test
    public void nextFieldShouldHave1(){
        MineField mineField = new MineField();
        mineField.setMine(0);
        assertEquals("1", mineField.getSquare(1));
    }

    @Test
    public void firstSquareInNextRowShouldNotBeSetTo1(){
        MineField mineField = new MineField();
        mineField.setMine(7);
        assertEquals(".", mineField.getSquare(8));
    }

    @Test
    public void lastSquareInpreviousRowShouldNotBeSetTo1(){
        MineField mineField = new MineField();
        mineField.setMine(4);
        assertEquals(".", mineField.getSquare(3));
    }

    @Test
    public void previousFieldShouldHave1(){
        MineField mineField = new MineField();
        mineField.setMine(1);
        assertEquals("1", mineField.getSquare(0));
    }

    @Test
    public void betweenTwoMinesShouldHave2() {
        MineField mineField = new MineField();
        mineField.setMine(0);
        mineField.setMine(2);
        assertEquals("2", mineField.getSquare(1));
    }

}