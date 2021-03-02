import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        for (int i=0;i<arr.length ;i++)
        {
            for(int j=0;j<arr.length;j++) {
                if (arr[i] + arr[j] == sum)
                {
                    System.out.println(arr[i] + " " + arr[j]);
                    arr[i]='0';
                    arr[j]='0';
                }
            }
        }
    }
}