import org.junit.Assert;
import org.junit.Test;

public class EinstiegsBeispielTest {


    @Test
    public void TestBinaryToDecimalWithValidInput() {
        int[] binaryArray = {1, 1, 1, 0};
        int result = BinaryToDecimal.binaryToDecimal(binaryArray);
        Assert.assertEquals(14, result);
    }


    @Test
    public void testBinaryToDecimalWithZero() {
        int[] binaryArray = {0};
        int result = BinaryToDecimal.binaryToDecimal(binaryArray);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testBinaryToDecimalWithOnes() {
        int[] binaryArray = {1, 1, 1, 1};
        int result = BinaryToDecimal.binaryToDecimal(binaryArray);
        Assert.assertEquals(15, result);
    }

    @Test
    public void testBinaryToDecimalTrue() {
        int[] binaryArray1 = {1, 0, 1, 0};
        int expectedDecimal = 10;
        Assert.assertTrue(expectedDecimal == BinaryToDecimal.binaryToDecimal(binaryArray1));
    }
    @Test
    public void testBinaryToDecimalFalse() {
        int[] binaryArray1 = {1, 0, 1, 0};
        int expectedDecimal1 = 10;
        int resultOne = BinaryToDecimal.binaryToDecimal(binaryArray1);
        Assert.assertFalse(resultOne != expectedDecimal1);

    }




        @Test(expected = IllegalArgumentException.class)
    public void testBinaryToDecimalWithInvalidInput() {
        int[] binaryArray = {1, 2, 0, 1};
        BinaryToDecimal.binaryToDecimal(binaryArray);
    }



}
