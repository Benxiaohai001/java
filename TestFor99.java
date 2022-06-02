/*
	需求：打印九九乘法表
*/
import java.util.Scanner;
public class TestFor99{
	public static void main(String[] args){
		Scanner cheng=new Scanner(System.in);
		int x = cheng.nextInt();
		for(int i=1;i<=x;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				//System.out.print(\b);
			}
			System.out.println();
		}
	} 
}