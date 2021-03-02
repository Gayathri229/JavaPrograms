import java.util.Scanner;

public class Molecules {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int h=sc.nextInt();
        int o=sc.nextInt();
        int h2o=0,co2=0,ch4=0;
        if(h>=2 && o>=1) {
            h2o = Math.min(h / 2,o);
            o = o - h2o;
            h = h - h2o*2;
        }
        if(c>=1 && o>=2) {
            co2 = Math.min(c,o/2);
            o = o - co2 * 2;
            c = c - co2;
        }
        if(c>=1 && h>=4)
            ch4=h/4;
//        System.out.println(h);
//        System.out.println(c);
//        System.out.println(o);
        System.out.println(h2o);
        System.out.println(co2);
        System.out.println(ch4);
    }
}