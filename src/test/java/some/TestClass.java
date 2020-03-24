package some;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void testLogin() {

        Assertions.assertEquals(1, new Record1(2).t());
    }

}
