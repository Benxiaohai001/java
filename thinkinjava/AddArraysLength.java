package arrays;

import java.util.Arrays;

public class AddArraysLength {

	public static void main(String[] args) {
		int [] a = new int [30];// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*101);
		}
		String astr = Arrays.toString(a);
		System.out.println(astr);
		int [] newa = new int [40];
		for (int i = 0; i < a.length; i++) {
			newa[i] = a[i];
		}
		//newa = a;//直接赋值行不通
		a = newa;
		String astr1 = Arrays.toString(a);
		System.out.println(astr1);//为什么输出，还是三十位元素？错误应该是四十位啊。
	}

}
