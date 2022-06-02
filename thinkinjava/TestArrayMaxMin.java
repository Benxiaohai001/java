/**
 * @author BichaoXue
 * 
 * 
 */
package arrays;


public class TestArrayMaxMin {

	public static void main(String[] args) {
		int [] a = new int [20];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*101);
		}
		show(a);
		//找出最大值
		for (int i = 1; i < a.length; i++) {
			if (a[0] < a[i]) {
				System.out.println(a[0]+"<-------->"+a[i]);
				int temp ;
				temp = a[0];
				a[0] = a[i];
				a[i] = temp;
			}
			
		}
		System.out.println("最大值是："+a[0]);
		show(a);
		//找出最小值
		for (int i = 1; i < a.length; i++) {
			if (a[0] > a[i]) {
				System.out.println(a[0]+"<-------->"+a[i]);
				int temp ;
				temp = a[0];
				a[0] = a[i];
				a[i] = temp;
			}
		}
		System.out.println("最小值是："+a[0]);

		show(a);// TODO Auto-generated method stub
	}
	static void show(int [] array) {
		System.out.println("展示数组的值：");
		for (int i : array) {
			System.out.print(" "+i+" ");
		}
	}
}
