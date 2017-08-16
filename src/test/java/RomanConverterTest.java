import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class RomanConverterTest {

    private final String expectedOutput;
    private final int number;

    RomanConverter testObject = new RomanConverter();

    @Parameters(name = "{1} -> {0}")
    public static Object[][] data(){
        return new Object[][]{
                {"I",1},
                {"II",2},
                {"III",3},
                {"IV",4},
                {"V",5},
                {"VI",6},
                {"VII",7},
                {"VIII",8},
                {"IX",9},
                {"X",10},
                {"XI",11},
                {"XIV",14},
                {"XV",15},
                {"XVII",17},
                {"XIX",19},
                {"XX",20},
                {"XXXIX",39},
                {"XL",40},
                {"XLIX",49},
                {"L",50},
                {"LXXXIX",89},
                {"XC",90},
                {"XCIX",99},
                {"C",100},
                {"CCCXCIX",399},
                {"CD",400},
                {"D",500},
                {"CM",900},
                {"M",1000}
        };
    }

    public RomanConverterTest(String expectedOutput, int number){
        this.expectedOutput = expectedOutput;
        this.number = number;
    }

    @Test
    public void assertConvertedNumberToRomanNumber(){
        assertConversion(expectedOutput,number);
    }

    private void assertConversion(String expected, int number){
        Assert.assertEquals(expected, testObject.convert(number));
    }

}
