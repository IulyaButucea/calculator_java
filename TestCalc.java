import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCalc {
    public void testCalculator()
    {
        List<Float> numbers = new ArrayList(Arrays.asList(2.0F, 100.0F, 10.0F, 1000.0F));
        List<String> operations = new ArrayList(Arrays.asList("/", "/", "*"));
        float expect_result =  2.0f;
//          float expect_result = 1.99999990f;
        Calculator.Calculate(numbers, operations);
        float test_result = Calculator.finalResult;
        System.out.println("Expected result: "+ expect_result+"\nReceived result: "+test_result);
             if (expect_result == test_result) {
                      System.out.println("Test succeeded!");
                 }
             else {
                 System.out.println("Test failed!");
             }
    }

    public static void  main (String[] args) {
        TestCalc testCalc = new TestCalc();
        testCalc.testCalculator();
    }
}
