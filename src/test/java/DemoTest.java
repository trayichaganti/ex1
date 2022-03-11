import static org.junit.Assert.*;
import org.junit.Test;




public class DemoTest {
    @Test
    public void test1(){
        Demo a = new Demo();
        assertEquals("it is a prime number",a.Prime(2));
    }
}
