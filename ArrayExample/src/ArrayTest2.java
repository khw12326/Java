
public class ArrayTest2 {

	public static void main(String[] args) {
		int[] score = {50,89,78,98,99};
		int[] score2 = new int[5];//0으로 초기화
		int[] score3 = null;//null로 초기화 
		score =new int[] {98,65,78,56,91};
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += score[i];
			
		}
		System.out.println("총점:"+sum);
		
		int sum2 =add(new int[] {99,56,74});
		System.out.println("총점2:"+sum2);
	
		

	}
	
	public static int add(int[] score) {
		int sum = 0;
		for(int i = 0 ; i<5; i++) {
			sum += score[i];
	}
	return sum;
	}
	

