package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW7.src;

import annotations.AfterSuite;
import annotations.BeforeSuite;
import annotations.Test;

public class B {
    @Test
    public static void B1(){
        System.out.println("B1");
    }
    @Test (priority =10)
    public static void B2(){
        System.out.println("B2");
    }
    @Test (priority = 2)
    public static void B3(){
        System.out.println("B3");
    }
    @Test (priority = 9)
    public static void B4(){
        System.out.println("B4");
    }
    @Test (priority = 8)
    public static void B5(){
        System.out.println("B5");
    }
    @Test (priority = 8)
    public static void B6(){
        System.out.println("B6");
    }
    @Test (priority = 8)
    public static void B7(){
        System.out.println("B7");
    }
    @Test (priority = 7)
    public static void B8(){
        System.out.println("B8");
    }
    @Test (priority = 5)
    public static void B9(){
        System.out.println("B9");
    }
    @Test (priority = 6)
    public static void B10(){
        System.out.println("B10");
    }
    @Test
    @BeforeSuite
    public static void B11(){
        System.out.println("B11");
    }
    @Test
    @AfterSuite
    public static void B12(){
        System.out.println("B12");
    }
}
