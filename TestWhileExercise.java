public class TestWhileExercise{
	public static void main(String [] args){
		int i = 1;
		while(i <= 100){
			if(i%10 == 1){
				System.out.println();
			}
			System.out.print(" ");
			System.out.print(i);
			i++;
		}
	}
}