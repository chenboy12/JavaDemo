package test;

import java.lang.Integer;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestClass {

    public void MainTest(){
        /*Integer x=127;
        Integer y=127;
        Integer m=99999;l
        Integer n=99999;
        System.out.println("x==y:"+(x==y));
        System.out.println("m==n:"+(m==n));
        System.out.println("x.equals(y):"+(x.equals(y)));
        System.out.println("m.equals(n):"+(m.equals(n)));*/
        BigDecimal bd=new BigDecimal("1200.45828975");
        //System.out.println(bigDecimal.multiply(bigDecimal));
        System.out.println("scale()表示小数位数:"+bd.scale());
        System.out.println(bd.stripTrailingZeros().scale());
        BigDecimal bd1=bd.setScale(6, RoundingMode.HALF_UP);
        System.out.println("Half_up:"+bd1);
        BigDecimal bd2=bd.setScale(6,RoundingMode.DOWN);
        System.out.println("Down:"+bd2);
        BigDecimal d3=bd.setScale(6,RoundingMode.HALF_DOWN);
        System.out.println("Half_down"+d3);
        BigDecimal d4=bd.setScale(6,RoundingMode.HALF_EVEN);
        System.out.println("Half_even:"+d4);
        BigDecimal equalsbd1=new BigDecimal("15.1254");
        BigDecimal equalsbd2=new BigDecimal("15.125400");
        System.out.println(equalsbd1.equals(equalsbd2));
        System.out.println(equalsbd1.equals(equalsbd2.stripTrailingZeros()));

        BigDecimal compareto1=new BigDecimal("12.2635");
        BigDecimal compareto2=new BigDecimal("12.2635");
        BigDecimal compareto3=new BigDecimal("12.263500");
        BigDecimal compareto4=new BigDecimal("12.2638");
        System.out.println("compare1-compare2:"+compareto1.compareTo(compareto2));//0
        System.out.println("compare1-compare3:"+compareto1.compareTo(compareto3));//0
        System.out.println("compare1-compare4:"+compareto1.compareTo(compareto4));//-1
        System.out.println("compare4-compare1:"+compareto4.compareTo(compareto1));//1
    }
}
