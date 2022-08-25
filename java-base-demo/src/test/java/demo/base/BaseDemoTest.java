package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    //Success
    @Test
    public void sum() {
        BaseDemo baseDemo = new BaseDemo();
        int expected = 2;

        assertEquals(expected, baseDemo.sum(1, 1));
    }

    //------Failed
    @Test
    public void failedSum() {
        BaseDemo baseDemo = new BaseDemo();
        int expected = 5;

        assertEquals(expected, baseDemo.sum(1, 1));
    }
}
