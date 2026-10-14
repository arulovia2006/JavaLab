
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddNumbersTest {

    @Test
    void testAddition() {
        assertEquals(30, AddNumbers.add(10, 20));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, AddNumbers.add(-2, -3));
    }
}
