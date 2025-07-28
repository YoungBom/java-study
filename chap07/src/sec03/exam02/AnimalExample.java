package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
		System.out.println("-----");
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog(); // 자식 객체를 부모 타입에 대입
		animal.sound();
		animal = new Cat(); // 자식 객체를 부모 타입에 대입
		animal.sound();
		System.out.println("-----");
		
		// 매개 변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
