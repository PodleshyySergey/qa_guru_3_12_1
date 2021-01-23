import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SomeTests01 {

    @Test
    public void test01() {
        Assertions.assertTrue(true);
    }

    @Test
    public void test02() {
        Assertions.assertTrue(true);
    }

    @Test
    public void test03() {
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled
    public void test04() {
        Assertions.assertTrue(true);
    }

    @Test
    @Disabled("Wait fix block bug.")
    public void test05() {
        Assertions.assertTrue(true);
    }

}
