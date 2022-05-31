
public class ArrayTest {

	public static void main(String[] args) {
		int[] score= {51, 89, 94, 65, 84};
		int sum = 0;
		for(int i = 0; i<5; i++) {
			sum += score[i];
		}
		System.out.println("ÃÑÁ¡: "+ sum);
		int avg = sum/5;
		System.out.println("Æò±Õ: "+ avg);

	}

}
