import java.util.Scanner;
public class TestIfQianTao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print("你输入的是："); 
		System.out.println(i);
		if(i > 100){
			if(i < 150){
				System.out.print("你输入的值大于一百小于一百五十");
				
			}else if(i < 200){
				System.out.print("你输入的值不小于一百五，小于二百");
				
			}else{
				System.out.print("你输入的值不小于二百");
			}
		}else if(i > 50){
			System.out.print("你输入的值大于五十，不大于一百");
			
		}else{
			System.out.print("你输入的值不大于五十");
		}
	}
}