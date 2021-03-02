import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EntryWithHighestKey {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Map<String,String> map=new TreeMap<String, String>();
        int i=0;
        while(i<3)
        {
            String key=sc.nextLine();
            String value=sc.nextLine();
            map.put(key,value);
            i++;
        }
        System.out.println(((TreeMap<String, String>) map).lastEntry());

    }
}
