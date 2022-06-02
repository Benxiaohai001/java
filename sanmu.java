public class sanmu{
	public static void main(String [] args){
		/*int x = 3 ;
		int y = 4;
		int z = x > y? x : y;
		String st = z > 6? "大于":"小于";
		System.out.println(st);*/
		int x , y ,z;
  		x = 45;
		y = 32;
 		z = 91;
  		int a = x > y ? x : y;
		a = a > z ? a : z;
		int b = x > y? y : x;
		b = b > z? z : b;
		int c = (a == x || b == x ? (a == y || b==y ? z:y): x);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);


		
	
	}

}