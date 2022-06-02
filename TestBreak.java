public class TestBreak{
	public static void main(String[] args){
		show();
		System.out.print("main-gg");
	}
	static void show(){
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("gg");
	}
}