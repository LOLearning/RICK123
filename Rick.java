import java.util.Scanner;

	public class Rick {
         public static void main(String[] args) { 
        	 Scanner net = new Scanner(System.in);
        	 System.out.print("�п�J�A���m�W:");
        	 String name = net.next();
        	 System.out.print("�п�J�A���~��:");
        	 int age = net.nextInt();
        	 System.out.printf("%s �A�n!�A���~�֬�%d��%n",name,age);
        	 System.out.print("�п�J�A���y�k��:");
        	 String mot;
        	 while((mot = net.nextLine()).equals("") ){}
        	 System.out.println("�A���y�k�ʬO:"+ mot);
       }
}