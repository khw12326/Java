
public class ArrayTest2 {

	public static void main(String[] args) {
		int[] score = {50,89,78,98,99};
		int[] score2 = new int[5];//0���� �ʱ�ȭ
		int[] score3 = null;//null�� �ʱ�ȭ 
		score =new int[] {98,65,78,56,91};
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += score[i];
			
		}
		System.out.println("����:"+sum);
		
		int sum2 =add(new int[] {99,56,74});
		System.out.println("����2:"+sum2);
	
		

	}
	
	public static int add(int[] score) {
		int sum = 0;
		for(int i = 0 ; i<5; i++) {
			sum += score[i];
	}
	return sum;
	}
	

