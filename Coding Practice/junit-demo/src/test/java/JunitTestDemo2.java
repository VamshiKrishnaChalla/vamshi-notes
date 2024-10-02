import org.example.JunitDemo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class JunitTestDemo2 {
    JunitDemo calc = new JunitDemo();

    @Nested
    class AdditionTest
    {
        @Test
        public void additionTest1()
        {
            Assertions.assertEquals(5, calc.addTwoNos(1,4));
        }
        @Test
        public void additionTest2()
        {
            Assertions.assertEquals(3, calc.addTwoNos(-1,4));
        }
    }
    @Test
    public void divisionTest()
    {
        Assertions.assertEquals(3,calc.divTwoNos(6,2));
    }

    @EnabledOnOs(OS.LINUX)
    @Test
    public void assertBooleanTest()
    {
        Assertions.assertTrue(true);
    }

    @RepeatedTest(3)
    public void addRepeatedTest(RepetitionInfo info)
    {
        if(info.getCurrentRepetition() <=2 )
        {
            Assertions.assertEquals(10, calc.addTwoNos(5,5));
        }
        else
        {
            Assertions.assertEquals(20, calc.addTwoNos(10,10));
        }
    }
}
