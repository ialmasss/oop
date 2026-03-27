package week4;

interface CanHavePizza {
	void receivePizza(String pizzaName);
}

abstract class Animal {
	protected String name;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() { return name; }

	public String toString() {
		return getClass().getSimpleName() +  name + ", age=" + age;
	}
}

class Cat extends Animal implements CanHavePizza {
	public Cat(String name, int age) {
		super(name, age);
 	}

 public void receivePizza(String pizzaName) {
     System.out.println("Cat " + name + " is happily eating pizza: " + pizzaName);
 	}
}

abstract class Person {
	 protected String name;
	 protected int age;

	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }

	 public String getName() { return name; }

	 public String toString() {
		 return getClass().getSimpleName() + name + ", age=" + age;
	 }
}


class Student extends Person implements CanHavePizza {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
 	}

 	public void receivePizza(String pizzaName) {
 		System.out.println("Student " + name + " (" + major + ") received pizza: " + pizzaName);
 	}
}


class Restaurant {
	private String restaurantName;

	public Restaurant(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public void servePizza(CanHavePizza guest, String pizzaName) {
		System.out.println(restaurantName + " is serving '" + pizzaName + "'...");
		guest.receivePizza(pizzaName);
	}
}


class Main {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("Pizza Palace");

		Student john = new Student("John", 20, "Computer Science");
		Student maria = new Student("Maria", 22, "Mathematics");
		Cat kitty = new Cat("Kitty", 3);

		System.out.println("Serving pizza:");
	    restaurant.servePizza(john, "Margherita");
	    restaurant.servePizza(maria, "Pepperoni");
	    restaurant.servePizza(kitty, "Tuna Special");
	}
}