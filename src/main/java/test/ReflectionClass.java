package test;

import org.apache.juli.logging.Log;

import java.io.File;
import java.lang.Object;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@AnnotationClass
public class ReflectionClass {
    public String Name;
    public void ReflectionFun(Class cls) throws NoSuchFieldException, NoSuchMethodException {
        System.out.println("getName:"+cls.getName());
        Class cs= LogClass.class;
        Field fl=cs.getField("Name");
        Method mh=cs.getMethod("Log4j");
        Field fd=cs.getDeclaredField("Name");
    }
}
