import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHello {

    @Test
    public void testShouldSayHelloWorldWithTwoExclamationMarks() {
        Hello hello = new Hello();
        String result = hello.say();
        String expected = "Hello world!!";

        assertEquals(expected, result);
    }

}