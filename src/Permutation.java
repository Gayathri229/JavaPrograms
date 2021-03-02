import java.util.Scanner;

public class Permutation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();

        Permutation p= new Permutation();
        p.permute(s,0,n-1);
    }
    public void permute(String str,int st,int end) {
        if (st == end)
            System.out.println(str);
        else
        {
            for(int i=st;i<=end;i++)
            {
                str=swap(str,st,i);
                permute(str,st+1,end);
                str=swap(str,st,i);
            }
        }

    }
    public String swap(String str,int st, int end)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[st] ;
        charArray[st] = charArray[end];
        charArray[end] = temp;
        return String.valueOf(charArray);

    }
}
