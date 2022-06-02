/**
 * 冒泡排序及其优化
 * 
 * @author BichaoXue
 *
 */
package arrays;
public class TestArrayMaopao {

	public static void main(String[] args) {
		int [] a = new int [20];// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		a[0] = 22;
		a[1] = 10;
		a[2] = 11;
		show(a);
		//sort(a);
		sortYouhua1(a);
		show(a);
	}
	static void sort(int [] array) {
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			int con = 0;
			for (int j = 0; j < array.length-i-1; j++) {//为什么条件改为length-i会报错？length是长度，起始位置是0；
				con++;
				if (array[j] > array[j+1]) {
					int temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] =temp;
				}
			}
			System.out.println("内循环执行了 "+con+"次");
			num+=con;
		}
		System.out.println("内循环总共执行了"+num+"次");
	}
	static void show(int [] array) {
		for (int i : array) {
			System.out.print("   "+i);
		}
		System.out.println();
	}
	static void sortYouhua1(int [] array) {
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			int con = 0;
			boolean flag =false;
			for (int j = 0; j < array.length-i-1; j++) {//为什么条件改为length-i会报错？length是长度，起始位置是0；
				con++;
				if (array[j] > array[j+1]) {
					int temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] =temp;
					flag = true;
				}
			}
			System.out.println("内循环执行了 "+con+"次");
			num+=con;
			System.out.println("内循环总共执行了"+num+"次");
			if (!flag) {
				return;
			}	
		}
	}
}
