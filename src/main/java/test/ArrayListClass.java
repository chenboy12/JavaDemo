package test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        for (Object ss :  list){
            System.out.println("ss"+ss);
        }
    }

    public void ListToArray(){
        List<String> list=List.of("陈博","男","18");
        String [] strings=(String [])list.toArray();
        for (String  s :strings){
            System.out.println("s:"+s);
        }

        List<Integer> listint=List.of(10,15,26);
        Integer [] arrayint= listint.toArray(new Integer[2]);
        for(Integer integer:arrayint){
            System.out.println("integer:"+integer);
        }

        List<String> liststring=List.of("车标","女","15");
        String [] strings1= liststring.toArray(new String[liststring.size()]);
        for(String s:strings1){
            System.out.println("s:"+s);
        }
    }

    public void ListIndexOf(){
        List<String> strings=List.of("陈博","男","18");
        int a=0;
        if(strings.contains("陈博")){
            a=strings.indexOf("女");
            System.out.println(a);
        }
        String name="鱼鱼";
        List<BaseClass> listcon=List.of(new BaseClass("陈博"),new BaseClass("男"),new BaseClass("18"));
        System.out.println(listcon.contains(new BaseClass("陈博")));
    }
}
