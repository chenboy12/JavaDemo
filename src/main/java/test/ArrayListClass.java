package test;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public void RunList(){
        ArrayList list=new ArrayList();
        list.add("陈博");
        list.add("陈博");
        list.add("男");

        for (int i =0 ;i<list.size();i++){
            String str=(String)list.get(i);
            System.out.println("str"+str);
        }
        for (Iterator<String> it = list.iterator(); it.hasNext();){
            String s= it.next();
            System.out.println("s"+s);
        }
        for (Object ss : list){
            System.out.println("ss"+ss);
        }
    }
}
