
public class Arraytest01 {

	public static void main(String[] args) {
		int[] score = {100,95,87,64,62};
		System.out.println(score.length);
		
		
		
		int sum = 0,avg = 0;//�迭�� �հ�
		for(int i : score)//���� for��
			sum += i;
		System.out.println("���� :"+sum);
		avg = sum/score.length;
		System.out.println("��� :"+avg);
		

	}

}
