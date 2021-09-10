package test;

import java.lang.reflect.InvocationTargetException;

public class Pair <T,K,N> {
    private T Name;
    private K Age;
    private N IsTrue;
    public Pair(Class<T> classt,Class<K> classk,Class<N> classn) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Name=classt.getDeclaredConstructor().newInstance();
        Age=classk.getDeclaredConstructor().newInstance();
        IsTrue=classn.getDeclaredConstructor().newInstance();
    }
    public T getName(){
        return Name;
    }
    public void setName(T Name){
        this.Name=Name;
    }
    public K getAge(){
        return Age;
    }
    public void setAge(K Age){
        this.Age=Age;
    }
    public N getIsTrue(){
        return IsTrue;
    }
    public void setIsTrue(N IsTrue){
        this.IsTrue=IsTrue;
    }
}
