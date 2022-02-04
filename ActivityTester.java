import static org.junit.Assert.*;
import org.junit.*;

public class ActivityTester {

    @Test
    public void testAdd() {
        assertEquals(2, Activity.add(1, 1));
    }
}
