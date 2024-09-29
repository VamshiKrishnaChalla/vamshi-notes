import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitDemoTest
{
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
    public void juinttestcase1() {
        String actualValue = "Hello World!";
        Assertions.assertEquals("Hello World!", actualValue);
    }

    @Test
    public void junitTestCase2()
    {
        String actualValue = "Coding Simplified";
        Assertions.assertEquals("Coding Simplified", actualValue);
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
