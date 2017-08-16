import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz testObject = new FizzBuzz();

    @Test
    public void shouldReturnEmptyArrayWhen0Provided(){
        Assert.assertArrayEquals(new String[0], testObject.fizzBuzz(0));
    }

    @Test
    public void shouldReturnArrayWith1ElementWhen1Provided(){
        Assert.assertArrayEquals(new String[]{"1"}, testObject.fizzBuzz(1));
    }

    @Test
    public void shouldReturnArrayWith2ElementsWhen2Provided(){
        Assert.assertArrayEquals(new String[]{"1","2"}, testObject.fizzBuzz(2));
    }

    @Test
    public void shouldReturnArrayWith1and2andFizzWhen3Provided(){
        Assert.assertArrayEquals(new String[]{"1","2","Fizz"}, testObject.fizzBuzz(3));
    }

    @Test
    public void shouldReturnArrayWithBuzzOn5thWhen5Provided() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, testObject.fizzBuzz(5));
    }

    @Test
    public void shouldReturnArrayWith2FizzOn3edAnd6thWhen6Provided(){
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz","Fizz"}, testObject.fizzBuzz(6));
    }

    @Test
    public void shouldReturnArrayWith3FizzAnd2BuzzWhen10Provided(){
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"}, testObject.fizzBuzz(10));
    }

    @Test(expected = Exception.class)
    public void shouldReturnExceptionWhenNegativeProvided(){
        testObject.fizzBuzz(-1);
    }

    @Test
    public void shouldReturnArrayWith3FizzAnd2BuzzWhen15Provided(){
        Assert.assertEquals("FizzBuzz", testObject.getStringRepresentation(15));
    }
}
