import java.util.Scanner;

public class FreqOfChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count;

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            count = 1;


            for (int j = i + 1; j < arr.length; j++) {


                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    count++;
                }

            }
            if(arr[i]!=0)
                System.out.println(arr[i] + " : " + count);
        }

    }
}