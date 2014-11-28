import org.junit.Test;

public class MineFieldTest {

    @Test
    public void shouldCreateMinefield() throws Exception {
        MineField mineField = new MineField();
        mineField.findMines(2);
    }
}