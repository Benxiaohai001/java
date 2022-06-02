/**
 *   @author BichaoXue
 * 选择排序
 *
 */
package arrays;

public class TestArraySelect {
	public static void main(String[] args) {
		int [] a = new int [20];
		System.out.print("数组初始化：");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*101);
		}
		show(a);
		System.out.println();
		System.out.println("初始化完成");
		/**
		 * 选择排序
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
		System.out.println("排序结束！！！");
		show(a);
	}
	static void show(int array[]) {
		for (int i : array) {
			System.out.print(" "+i+" ");
			
		}
	}
}
