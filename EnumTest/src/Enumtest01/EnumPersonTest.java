package Enumtest01;

public class EnumPersonTest {

	public static void who(Person man) {
		switch(man) {
		case Man:
			System.out.println("남성");
			break;
		case Woman:
			System.out.println("여성");
			break;
		}

	}
	public static void main(String[] args) {
		who(Person.Woman);
		
	}

}
