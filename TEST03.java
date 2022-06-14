
public class TEST03 {

	public static void main(String[] args) {
		//향상된 for문 
		int[] scores = {95,85,99,75,78};
		
		int sum= 0;
		for(int i : scores) {
		sum += i;
		}
		System.out.println("총점: "+ sum);

}
}