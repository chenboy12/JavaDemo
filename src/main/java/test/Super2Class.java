package test;

public class Super2Class<T> extends Super1Class{
    private boolean Sex;
    public void SetSex(Boolean Sex){
        this.Sex=Sex;
    }
    public String GetSex(){
        return BoolSex(this.Sex);
    }
    private String BoolSex(Boolean Sex){
        if(Sex==true){
            return "男";
        }
        else{
            return "女";
        }
    }
}
