import java.util.Scanner;
public class Rick32 {
	public static void main(String[] args) {
		Scanner good = new Scanner(System.in);
		System.out.print("�п�J�@�ӼƧP�_�O�_���٬O����: ");
		int number = good.nextInt();
		if(number %2 == 0)
			System.out.print("���Ƭ�����");
		else
			System.out.print("���Ƭ��_��");
	}
}