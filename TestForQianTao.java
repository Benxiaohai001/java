import java.util.Scanner;
public class TestForQianTao{
	public static void main(String[] args){
		/*for(i = 1;i <= 4 ; i++){
			for(x = 1; x <= 5;x++){
				System.out.print("5");
			}
			System.out.println();
		}*/
		/*for(i=1;i<=5;i++){
			System.out.println();
			for(x=1;x<=6;x++){
				System.out.print(i);
			}
		}*/
		/*
		1
	   2 2
      3   3
     4     4
    5	 	5
		*/
		int y;
		System.out.print("ÇëÊäÈëÊý×Ö£º");
		Scanner Shu = new Scanner(System.in);
		y=Shu.nextInt();
		for(int i = 1;i <= y;i++){
			for(int a=i;a<=y;a++){
				System.out.print(" ");
			}
			if(i!=1){
				System.out.print(i);
				for(int a = 2;a<=i;a++){
					if(a!=2)
						System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.print(i);
			System.out.println();
		}
	}
}