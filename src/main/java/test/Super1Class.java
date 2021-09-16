package test;

public class Super1Class<T> extends SuperClass {
    private T Age;
    public void SetAge(T Age){
        this.Age= Age;
    }
    public T GetAge(){
        return this.Age;
    }
}
