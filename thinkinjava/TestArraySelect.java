/**
 *   @author BichaoXue
 * ѡ������
 *
 */
package arrays;

public class TestArraySelect {
	public static void main(String[] args) {
		int [] a = new int [20];
		System.out.print("�����ʼ����");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*101);
		}
		show(a);
		System.out.println();
		System.out.println("��ʼ�����");
		/**
		 * ѡ������
		 */
		int num=0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					count++;
					System.out.println(a[i]+"<------>"+a[j]);
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				System.out.println("count :"+count);
			}
		num+=count;
		}
		System.out.println("num:"+num);
		System.out.println("�������������");
		show(a);
	}
	static void show(int array[]) {
		for (int i : array) {
			System.out.print(" "+i+" ");
			
		}
	}
}
