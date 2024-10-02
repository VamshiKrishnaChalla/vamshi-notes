import org.example.JunitDemo;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitDemoTest
{
    JunitDemo junitDemo = new JunitDemo();

    @Test
    @DisplayName("Adding two numbers")
    public void assertEqualTesting()
    {
        Assertions.assertEquals(4,junitDemo.addTwoNos(2,2), "Assert Test Failed");

    }

    @Test
    public void assertArrayEqualTesting()
    {
        Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
    }

    Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,8,2,3,4));
    Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,8,2,3,4));

    @Test
    public void assertIterableEqualsTesting()
    {
        Assertions.assertIterableEquals(listOne, listTwo);
    }

    String str1 = null;
    String str2 = "ABC";

    @Test
    public void assertNotNull1()
    {
        Assertions.assertNotNull(str1, "str1 is Null");
    }

    @Test
    public void assertNotNull()
    {
        Assertions.assertNotNull(str2, "str2 is Null");
    }

    @Test
    public void assertTrueTest()
    {
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
    }


    @BeforeAll
    void beforeClass()
    {
        System.out.println("Before....Test cases");
    }
    @BeforeEach
    void beforeTestCase()
    {
        System.out.println("Before Each Test Case...");
    }


    @Test
    @DisplayName("Junit Test Case 1")
    public void juinttestcase1() {
        String actualValue = "Hello World!";
        Assertions.assertEquals("Hello World!", actualValue);
    }

    @Test
    @Disabled
    public void junitTestCase2()
    {
        String actualValue = "Coding Simplified";
        Assertions.assertEquals("Coding Simplified", actualValue);
    }

    @Test
    public void assertExceptionTest()
    {
        Assertions.assertThrows(ArithmeticException.class, () -> junitDemo.divTwoNos(1,0));
    }

    @Test
    public void assertAllTest()
    {
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, junitDemo.addTwoNos(2,2),"AssertEquals Test Failed"),
                () -> Assertions.assertThrows(ArithmeticException.class, () -> junitDemo.divTwoNos(1,0), "AssertThrows failed")
        );

    }

    @AfterEach
    void afterTestCase() {
       System.out.println("After Each Test Case.....");
    }
    @AfterAll
    void afterClass() {
        System.out.println("AfterAll method....");
    }
}
