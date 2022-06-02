/**
 * 
 * @author BichaoXue
 *
 */
 package arrays;
import java.util.Arrays;

public class TestArraysTwo {
	public static void main(String[] args) {
		int [] [] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [] b = {1,2,3};
		String bstr = Arrays.toString(b);
		String astr = Arrays.toString(a);
		System.out.println(astr);
		System.out.println(bstr);
		int [] [] c = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println();
		bianli(c);
	}
	static void bianli(int [] [] array) {
		for (int[] is : array) {
			for (int it : is) {
				System.out.print(it);
			}
			System.out.println();
		}
	}
}
