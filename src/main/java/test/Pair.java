package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

public class Pair <T> {
    private T Name;
    public Pair(Class<T> clas) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Name= clas.getDeclaredConstructor().newInstance();
    }
    public String GetAnnotations(){
        Annotation[] annots=Name.getClass().getDeclaredAnnotations();
        String str="";
        for (int i=0;i<annots.length;i++){
            str+=str+annots[i].toString();
        }
        return str;
    }


//    private T Name;
//    private K Age;
//    public Pair(T ti,K ki){
//        this.Name=ti;
//        this.Age=ki;
//    }
//    @Override
//    public String toString(){
//        return "姓名："+this.Name+"，年龄："+ this.Age;
//    }
//    public T getName(){
//        return  this.Name;
//    }
//    public K getAge(){
//        return  this.Age;
//    }
}
