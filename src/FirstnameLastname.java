import java.util.*;

public class FirstnameLastname {

    public static void main(String args[])
    {
        ArrayList<String> firstNames=new ArrayList<>();
        ArrayList<String> lastNames=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toUpperCase();
        String[] name=str.split(";");
        for(String person:name)
        {

            String []names=person.split(":");
            String firstName=names[0];
            String lastName=names[1];
            firstNames.add(firstName);
            lastNames.add(lastName);

        }
        //fred:corwill;wilfred:corwill;barney:tornbull;betty:tornbull;bjon:tornbull;raphael:corwill;alfred:corwill
        for (int i = 0; i < lastNames.size(); i++) {

            for (int j = 0; j <lastNames.size(); j++) {
                if (lastNames.get(i).compareTo(lastNames.get(j))<0)
                {
                    Collections.swap(lastNames,i,j);
                    Collections.swap(firstNames,i,j);

                }
            }
        }
        for (int i=0;i<lastNames.size();i++){
            for (int j = 0; j < lastNames.size(); j++) {
                if (lastNames.get(i).equals(lastNames.get(j))&& firstNames.get(i).compareTo(firstNames.get(j))<0)
                {
                    Collections.swap(firstNames,i,j);
                }
            }
        }
        for (int i=0;i<firstNames.size();i++)
        {
            System.out.print("("+lastNames.get(i)+", "+firstNames.get(i)+")");
        }
    }
}