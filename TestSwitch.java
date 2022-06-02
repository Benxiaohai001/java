import java.util.Scanner;
public class TestSwitch{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		switch(i){
			case 1:System.out.println("1");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			case 5:System.out.println("5");break;
			default :System.out.println("不是1-5的数字");
		}
	}
}