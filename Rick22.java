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
	
	double all ;
	all=math+english+chinese;
	System.out.printf("�������� = %.2f",(all)/3);
	   
	}
}