import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardlist = new ArrayList<Integer>();
        card(cardlist);
        
        for (int i = 1; i <= 52; i++)
        {
            System.out.println(getcard(cardlist));
        }

    }

    public static void card(ArrayList<Integer> templist)
    {

        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 13; j++)
            {
                templist.add(j);
            }
        }
        /*
         * for (int var : lists) { System.out.print(var + " "); }
         * 
         * System.out.println("\n" + lists.get(35));
         */
    }

    public static int getcard(ArrayList<Integer> templist)
    {
        Random ran = new Random();
        int temp = ran.nextInt(templist.size());
        int number = templist.get(temp);
        templist.remove(temp);
        // System.out.println(templist.size()); 範圍大小 {0 ~(templist.size()-1)}

        return number;
    }

}