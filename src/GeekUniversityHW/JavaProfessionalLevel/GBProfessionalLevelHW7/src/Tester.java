package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW7.src;

import annotations.AfterSuite;
import annotations.BeforeSuite;
import annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Tester {
    public static int beforsuitecount;
    public static int aftersuitecount;
    public static Test annotation;
    public static int annotationvalue;
    public static int annotationvaluemin;
    public static ArrayList <Method> methodArrayList = new ArrayList<>();

    public static void start(Class testClass){
        Method[] methods = testClass.getDeclaredMethods();

        beforsuitecount = 0;
        aftersuitecount = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                beforsuitecount++;
            } else if (method.isAnnotationPresent(AfterSuite.class)) {
                aftersuitecount++;
            }
        }
        if (beforsuitecount > 1 || aftersuitecount > 1){
            throw new RuntimeException();
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)){
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        annotationvaluemin = 0;

        for (int i = 0; i < methods.length - 2; i++) {
            annotationvalue = 11;
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class) && !method.isAnnotationPresent(BeforeSuite.class) && !method.isAnnotationPresent(AfterSuite.class)) {
                    annotation = method.getAnnotation(Test.class);
                    if (annotation.priority() > annotationvaluemin && annotation.priority() < annotationvalue){
                        annotationvalue = annotation.priority();
                    }
                }
            }

            annotationvaluemin = annotationvalue;

            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class) && !method.isAnnotationPresent(BeforeSuite.class) && !method.isAnnotationPresent(AfterSuite.class)) {
                    annotation = method.getAnnotation(Test.class);
                    if (annotation.priority() == annotationvalue) {
                        try {
                            method.invoke(null);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(AfterSuite.class)){
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
