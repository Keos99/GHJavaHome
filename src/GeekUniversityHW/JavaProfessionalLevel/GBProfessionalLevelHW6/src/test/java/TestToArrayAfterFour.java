package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW6.src.test.java;

import GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW6.src.main.java.ArrayToArray;
import org.junit.Assert;
import org.junit.Test;

public class TestToArrayAfterFour {
    private ArrayToArray arrayToArray;

    @Test(expected = RuntimeException.class)
    public void testToArrayAfterFour(){
        int[] inputarray = {
                1,2,3,5,6,7,8,9,10
        };
        int[] outputarray = {
                5,6,7,8,9,10
        };
        arrayToArray = new ArrayToArray();
        Assert.assertArrayEquals(outputarray,arrayToArray.toArrayAfterFour(inputarray));
    }

    @Test
    public void testToArrayAfterFour2(){
        int[] inputarray = {
                9,8,7,6,5,4,3,2,1
        };
        int[] outputarray = {
                3,2,1
        };
        arrayToArray = new ArrayToArray();
        Assert.assertArrayEquals(outputarray,arrayToArray.toArrayAfterFour(inputarray));
    }

    @Test
    public void testToArrayAfterFour3(){
        int[] inputarray = {
                654,984,321,9847,4,65113,8498,4,654,3216,9878,4,3216,65469,6546
        };
        int[] outputarray = {
                3216,65469,6546
        };
        arrayToArray = new ArrayToArray();
        Assert.assertArrayEquals(outputarray,arrayToArray.toArrayAfterFour(inputarray));
    }

}
