package Enumtest01;

public class EnumPersonTest {

	public static void who(Person man) {
		switch(man) {
		case Man:
			System.out.println("����");
			break;
		case Woman:
			System.out.println("����");
			break;
		}

	}
	public static void main(String[] args) {
		who(Person.Woman);
		
	}

}
