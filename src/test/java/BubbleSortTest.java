import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    BubbleSort testObject = new BubbleSort();

    @Test
    public void shouldReturnEmptyArrayWhenNothingProvided(){
        Assert.assertArrayEquals(new int[0],testObject.sort());
    }

//    @Test
//    public void shouldReturnArrayWith0for0Provided(){
//        Assert.assertArrayEquals(new int[]{0},testObject.sort(0));
//    }

}
