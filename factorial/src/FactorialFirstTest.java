import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class FactorialOfFirstTest {

    @Test
    void testToString_0() {
        FactorialFirst temp = new FactorialFirst(0);
        assertEquals("", temp.toString());
    }
    @Test
    void testToString_1() {
        FactorialFirst temp = new FactorialFirst(1);
        assertEquals("1 ", temp.toString());
    }
    @Test
    void testToString_4() {
        FactorialFirst temp = new FactorialFirst(4);
        assertEquals("1 1 2 6 ", temp.toString());
    }
    @Test
    void testToString_Negative() {
        FactorialFirst temp = new FactorialFirst(-1);
        assertEquals("", temp.toString());
    }
}