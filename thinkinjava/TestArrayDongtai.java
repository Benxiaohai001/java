package arrays;
public class TestArrayDongtai {
	public static void main(String[] args) {
		boolean [] a = new boolean[10];
		int b [] = new int[10];
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
			show(b[0]);					
		}// TODO Auto-generated method stub
		System.out.println("³ÌÐò½áÊø");
	}
	static void show(int x) {
		System.out.println(x);
		System.out.println();
	}
}
