
public class Arraytest01 {

	public static void main(String[] args) {
		int[] score = {100,95,87,64,62};
		System.out.println(score.length);
		
		
		
		int sum = 0,avg = 0;//배열의 합계
		for(int i : score)//향상된 for문
			sum += i;
		System.out.println("총점 :"+sum);
		avg = sum/score.length;
		System.out.println("평균 :"+avg);
		

	}

}
