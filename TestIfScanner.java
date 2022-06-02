import java.util.Scanner;//1.导包
public class TestIfScanner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//2.创建对象
		int i = sc.nextInt();//3.调用方法，得到返回值。
		System.out.println("输入的数字是：");
		System.out.println(i);
		if(i > 10){
			System.out.println("输出的值大于十");
		}
		if(i % 2 == 0){
			System.out.println("输出的值可以整除二");
		}
		if(i > 10){
			System.out.println("输出的值大于一百");
		}
		
		
	}
}