package koreait.day09a;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("----------------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print(); // 상속 메소드
		System.out.println("----------------------------------");
		
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println("==================================");
		Animal temp = dog;		// 자식 객체는 부모클래스 타입으로 참조할 수 있다.
		temp.print();
//		temp.run();				// 오류 : 부모타입 변수로는 자식메소드 실행 불가
		temp = crow;			// 자식 객체는 부모클래스 타입으로 참조할 수 있다.
		temp.print();
//		temp.fly();				// 오류 : 부모타입 변수로는 자식메소드 실행 불가
		
		System.out.println("----------------------------------");
		Animal puppy = new Dog();	// 자식객체는 부모클래스 타입으로 참조할 수 있다. (자식클래스는 부모클래스 타입으로 자동 캐스팅)
		puppy.print();
//		puppy.run();				// 오류 : 부모타입 변수로는 자식메소드 실행 불가
		
		Dog puddle = (Dog)puppy;	// Animal 타입을 Dog 타입으로 강제 casting.
		puddle.run();			    // 	  puppy 변수가 참조하는 객체가 Dog 타입일때만 가능
		puddle.print();
	}
}
