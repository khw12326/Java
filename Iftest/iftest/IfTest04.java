package iftest;

public class IfTest04 {

	public static void main(String[] args) {
		int score = 99;
		
		if(score >= 90) {
			System.out.printf("점수는 %d점입니다.\n",score);
			System.out.println("등급은 A입니다.");
		} else if(score >= 80){
			System.out.println("점수가 80점 보다 큽니다.");
			System.out.println("등급이 B입니다.");
		} else if(score >= 70){
			System.out.println("점수가 70점 보다 큽니다.");
			System.out.println("등급이 C입니다.");
		} else if (score >= 60){
			System.out.println("점수가 60점 보다 큽니다.");
			System.out.println("등급이 D입니다.");
		
		}
	}

}
