public class TestCanshu{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		add(a , b);
		int c = -100;
		jueduizhi(c);
	}
	static int add(int x,int y){
		System.out.println("x + y ="+(x+y));
		return 1;
	}
	static void jueduizhi(int x){
		if(x >= 0)
			System.out.println(x);
		else
			System.out.println(-x);
	}
}