public class TestDigui{
	public static void main(String[] args){
		int i = 100;
		int a = add(i);
		System.out.println(a);
	}
	static int add(int i){
		if(i == 1)
			return i;
		else
			return i + add(i - 1);
	}
}