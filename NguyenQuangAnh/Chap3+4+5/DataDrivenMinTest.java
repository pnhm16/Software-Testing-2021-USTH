import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DataDrivenMinTest {
    private List list;
    private Object expected;

    public DataDrivenMinTest(List list, Object expected) {
        this.list = list;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {new ArrayList(Arrays.asList(1, 2)), 1},
                {new ArrayList(Arrays.asList("cat", "bat", "hat")), "bat"}
        });
    }

    @Test
    public void testMin() {
        assertEquals (expected, Min.min(list));
    }
}
