import java.util.Scanner;

public class Rick22 {
	public static void main(String[] args) {
		
	Scanner good = new Scanner(System.in);
   	System.out.print("�п�J�ƾǦ��Z:");
	int math = good.nextInt();
	System.out.print("�п�J�^�妨�Z:");
	int english = good.nextInt();
	System.out.print("�п�J��妨�Z:");
	int chinese = good.nextInt();
	
	
	System.out.printf("�������� = %.2f",(double)(math+english+chinese)/3);
	   
	}
}