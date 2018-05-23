package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW6.src.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestIsContainsOneOrFour {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[] {1,2,3,4,5,6,7,8,9,0}},
                {new int[] {2,3,4,5,6,7,8,9,0}},
                {new int[] {1,2,3,5,6,7,8,9,0}}
        });
    }

    private int[] a;

    public TestIsContainsOneOrFour(int[] a){
        this.a = a;
    }

    ArrayToArray arrayToArray;

    @Before
    public void init(){
        arrayToArray = new ArrayToArray();
    }

    @Test
    public void massTestIsContainsOneOrFour(){
        Assert.assertTrue(arrayToArray.isContainsOneOrFour(a));
    }
}
