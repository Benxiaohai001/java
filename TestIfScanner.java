import java.util.Scanner;//1.����
public class TestIfScanner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//2.��������
		int i = sc.nextInt();//3.���÷������õ�����ֵ��
		System.out.println("����������ǣ�");
		System.out.println(i);
		if(i > 10){
			System.out.println("�����ֵ����ʮ");
		}
		if(i % 2 == 0){
			System.out.println("�����ֵ����������");
		}
		if(i > 10){
			System.out.println("�����ֵ����һ��");
		}
		
		
	}
}