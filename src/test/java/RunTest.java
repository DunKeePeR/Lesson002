import org.junit.*;
import static org.junit.Assert.*;

public class RunTest {
    @Before
    public void PreviousTest() {
        System.out.println("Тест запущен");
    }

    @After
    public void afterTest() {
        System.out.println("Тест завершен");
    }

    @Test
    public void HelloTest(){
        Assert.assertEquals("Hello", ForTest.Hello());
    }

    @Test
    public void HelloTestFail(){
        Assert.assertEquals("Hello1", ForTest.Hello());
    }

    @Test
    public void testGetSum() {
        assertEquals(15, ForTest.getSum(7,8));
    }

    @Test
    public void testFailGetSum() {
        assertEquals(20, ForTest.getSum(10,9));
    }
}