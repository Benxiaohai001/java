public class TestMethod{
	public static void main(String[] args){
		//show();
		int i = show();
		System.out.println(i);
		add();
		add1();
	} 
	static int show(){
		
		System.out.println("show方法执行结束");
		return 1;
	}
	static void add(){
		System.out.println("add");
		return;
	}
	static String add1(){
		System.out.println("add1");
		return "1";
	}
}