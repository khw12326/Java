package iftest;

public class IfTest05 {

	public static void main(String[] args) {
		// �ֻ��� ������
		
		//double dice_number = Math.random() * 6; // 0.0�̻�~5.999�̸� ������ �Ǽ�
		int  dice_number = (int)(Math.random() * 6)+1;
		
		if(dice_number==1 ) {
			System.out.println("1���� ���Խ��ϴ�.");
			
		} else if(dice_number==2 ) {
			System.out.println("2���� ���Խ��ϴ�.");
			
		} else if(dice_number==3 ) {
			System.out.println("3���� ���Խ��ϴ�.");
			
		} else if(dice_number==4 ) {
			System.out.println("4���� ���Խ��ϴ�.");
			
		} else if(dice_number==5 ) {
			System.out.println("5���� ���Խ��ϴ�.");
			
		} else {
			System.out.println("6���� ���Խ��ϴ�.");

	}
  }
}
