import java.util.Scanner;
public class MinimumNoOfPlatforms {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arrival[]=new int[6];
        int departure[]=new int[6];
        int count,max=1;
        System.out.println("Enter the arrival time");
        for(int i=0;i<arrival.length;i++)
        {
            arrival[i]=sc.nextInt();
        }
        System.out.println("Enter the departure time");
        for(int i=0;i<departure.length;i++)
        {
            departure[i]=sc.nextInt();
        }
        for(int i=0;i<arrival.length;i++)
        {
            count=1;
            for(int j=i+1;j<arrival.length;j++)
            {
                if((arrival[i] >= arrival[j] && arrival[i] <= departure[j]) ||
                        (arrival[j] >= arrival[i] && arrival[j] <= departure[i]))
                {
                    count++;
                }
            }
            if(count>max)
                max=count;
        }
        System.out.println("Minimum number of platforms needed is : "+max);
    }
}