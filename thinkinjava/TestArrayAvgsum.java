/**
 * @author BichaoXue
 * �����ƽ��
 */
package arrays;

public class TestArrayAvgsum {

	public static void main(String[] args) {
		int [] i;
		i = new int  [10];
		for(int a = 0;a < i.length;a++) {
			i[a] =(int) (Math.random()*101);

			
		}	
		int sum = 0;
		System.out.println("���������룬��ֵ");
		for(int a:i) {
		
			sum+=a;
			
		}
		double avg = 0.0;
		avg = sum/i.length;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		System.out.println("��Ϸ����������");
	}

}
