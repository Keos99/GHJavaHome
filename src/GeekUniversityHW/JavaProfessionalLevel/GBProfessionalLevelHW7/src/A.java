package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW7.src;

import annotations.AfterSuite;
import annotations.BeforeSuite;
import annotations.Test;

public class A {

    @Test
    public static void A1(){
        System.out.println("A1");
    }
    @Test (priority =10)
    public static void A2(){
        System.out.println("A2");
    }
    @Test (priority = 2)
    public static void A3(){
        System.out.println("A3");
    }
    @Test (priority = 9)
    public static void A4(){
        System.out.println("A4");
    }
    @Test (priority = 3)
    public static void A5(){
        System.out.println("A5");
    }
    @Test (priority = 8)
    public static void A6(){
        System.out.println("A6");
    }
    @Test (priority = 4)
    public static void A7(){
        System.out.println("A7");
    }
    @Test (priority = 7)
    public static void A8(){
        System.out.println("A8");
    }
    @Test (priority = 5)
    public static void A9(){
        System.out.println("A9");
    }
    @Test (priority = 6)
    public static void A10(){
        System.out.println("A10");
    }
    @Test
    @BeforeSuite
    public static void A11(){
        System.out.println("A11");
    }
    @Test
    @AfterSuite
    public static void A12(){
        System.out.println("A12");
    }
}
