import java.util.Scanner;
public class TestIfQianTao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print("��������ǣ�"); 
		System.out.println(i);
		if(i > 100){
			if(i < 150){
				System.out.print("�������ֵ����һ��С��һ����ʮ");
				
			}else if(i < 200){
				System.out.print("�������ֵ��С��һ���壬С�ڶ���");
				
			}else{
				System.out.print("�������ֵ��С�ڶ���");
			}
		}else if(i > 50){
			System.out.print("�������ֵ������ʮ��������һ��");
			
		}else{
			System.out.print("�������ֵ��������ʮ");
		}
	}
}