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
		//newa = a;//ֱ�Ӹ�ֵ�в�ͨ
		a = newa;
		String astr1 = Arrays.toString(a);
		System.out.println(astr1);//Ϊʲô�����������ʮλԪ�أ�����Ӧ������ʮλ����
	}

}
