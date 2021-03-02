import java.util.Scanner;

public class RemoveVowels {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),str1="";
        char []arr=str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            if(arr[i]!='a'&& arr[i]!='e'&&arr[i]!='i'&&arr[i]!='o'&&arr[i]!='u'&&arr[i]!='A'&&arr[i]!='E'&&arr[i]!='I'&&arr[i]!='O'&&arr[i]!='U')
            {
                str1=str1+arr[i];
            }
        }
        System.out.println(str1);
    }
}