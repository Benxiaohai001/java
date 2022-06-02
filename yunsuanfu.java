public class yunsuanfu{
	public static void main(String [] args ){
		int i = 5;
		int y;
		System.out.println(i++);
		i = i ++;
		System.out.println(i);
		y = i++ + i++ + i-- + i--;
		System.out.println(i);
		System.out.println(y);
	}
}