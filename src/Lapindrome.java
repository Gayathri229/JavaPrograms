import java.util.Arrays;
import java.util.Scanner;

public class Lapindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner((System.in));
        String str=sc.nextLine();
        String str2;
        String str1 = str.substring(0, str.length() / 2);
        if(str.length()%2==0) {

            str2 = str.substring(str.length() / 2, str.length());
        }
        else
        {
            str2=str.substring(str.length()/2+1,str.length());
        }
        char []char1=str1.toCharArray();
        char []char2=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}