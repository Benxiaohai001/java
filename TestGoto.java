public class TestGoto{
	public static void main(String[] args){
test:	for(int i = 1;i < 10;i++){
			for(int j = 1;j < 10;j++){
				System.out.println();
				if(j ==3)
					continue test;
				System.out.print(j);
			}
			System.out.print("gg");
		}
	}
}