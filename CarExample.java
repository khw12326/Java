package classtest;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("����ȸ���"+myCar.company);
		System.out.println("�𵨸�:" + myCar.model);
		System.out.println("��������:" +myCar.color);
		System.out.println("�����ְ��ӵ�:" + myCar.maxspeed);
		System.out.println("��������ӵ�:" + myCar.speed);
		System.out.println("�õ�������?" + myCar.power);
		
		myCar.speed = 60;
		System.out.println("��������ӵ�:"+myCar.speed);
		
		

	}

}