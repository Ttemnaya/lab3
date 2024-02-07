import org.junit.Test;

import static org.junit.Assert.*;

public class EndStringFilterTest {
    EndStringFilter filter = new EndStringFilter("аму");

    @Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "аму");
    }

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("мама мыла раму"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("мама Мыла рамку"));
        assertFalse(filter.apply("папа мыл что-то"));
    }
}