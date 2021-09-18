package test;

public class BaseClass {
    private String Name;
    public BaseClass(String Name){
        this.Name=Name;
    }
    public String GetName(){
        return this.Name;
    }
    public void SetName(String Name){
        this.Name=Name;
    }
}
