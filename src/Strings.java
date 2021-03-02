import java.util.Scanner;
import java.util.ArrayList;

public class Strings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //String neww;
        int i,n=0,s=0,l=0,smallind=1000,longind=0;
        ArrayList <String> name= new ArrayList<String> ();

        for(i=0;i<10;i++)
        {
            String str=sc.next();
            n=str.length();
            if(s>n)
            {
                smallind=i;
                s=n;
            }
            if(l<n)
            {
                longind=i;
                l=n;
            }
            name.add(str);
        }
        if(smallind>longind)
            System.out.println(name.get(smallind));
        else
            System.out.println(name.get(longind));
    }
}
