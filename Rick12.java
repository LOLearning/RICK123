import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Rick12
{
    public static void main(String[] args)
    {
        ArrayList<Integer> cardlist = new ArrayList<Integer>();
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> player4 = new ArrayList<Integer>();
        card(cardlist);
        Scanner scn = new Scanner(System.in);
        for(int i =1; i<=5; i++)
        {
        player1.add(getcard(cardlist));
        player2.add(getcard(cardlist));
        player3.add(getcard(cardlist));
        player4.add(getcard(cardlist));
        }
        int  mychoose;
        int right =101;
        int total=0;
        for(int a =0; a<=right; a++){
        System.out.println("1.["+player1.get(0)+"]    2.["+player1.get(1)+"]    3.["+player1.get(2)+"]    4.["+player1.get(3)+"]    5.["+player1.get(4)+"]");
        System.out.print("輸入你的選擇(1~5): ");
        int choose = scn.nextInt();
        
        switch(choose)
        {
        case 1:
           mychoose= player1.get(0);
            break;
        case 2:
            mychoose= player1.get(1);
            break;
        case 3:
           mychoose= player1.get(2);
            break;
        case 4:
           mychoose= player1.get(3);
            break;
        default :
            mychoose= player1.get(4);
            
        }
        right=right-mychoose;
        total=total+mychoose;
        System.out.println("目前分數為: "+total);
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
    }

    public static int getcard(ArrayList<Integer> templist)
    {
        Random ran = new Random();
        int temp = ran.nextInt(templist.size());
        int number = templist.get(temp);
        templist.remove(temp);
        return number;
    }

}