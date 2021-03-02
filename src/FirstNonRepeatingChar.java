import java.util.Arrays;
import java.util.Scanner;
public class FirstNonRepeatingChar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count;
        char arr[]=str.toCharArray();
        //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("The first non repeating character is "+arr[i]);
                break;
            }

        }
    }
}