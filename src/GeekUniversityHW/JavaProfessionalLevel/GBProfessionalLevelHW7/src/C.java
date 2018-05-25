package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW7.src;

import annotations.AfterSuite;
import annotations.BeforeSuite;
import annotations.Test;

public class C {
    @Test
    public static void C1(){
        System.out.println("B1");
    }
    @Test (priority =10)
    @BeforeSuite
    public static void C2(){
        System.out.println("B2");
    }
    @Test (priority = 2)
    public static void C3(){
        System.out.println("B3");
    }
    @Test (priority = 9)
    public static void C4(){
        System.out.println("B4");
    }
    @Test (priority = 3)
    @AfterSuite
    public static void C5(){
        System.out.println("B5");
    }
    @Test (priority = 8)
    public static void C6(){
        System.out.println("B6");
    }
    @Test (priority = 4)
    public static void C7(){
        System.out.println("B7");
    }
    @Test (priority = 7)
    public static void C8(){
        System.out.println("B8");
    }
    @Test (priority = 5)
    public static void C9(){
        System.out.println("B9");
    }
    @Test (priority = 6)
    public static void C10(){
        System.out.println("B10");
    }
    @Test
    @BeforeSuite
    public static void C11(){
        System.out.println("B11");
    }
    @Test
    @AfterSuite
    public static void C12(){
        System.out.println("B12");
    }
}
