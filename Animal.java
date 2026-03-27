package week3;


class AnimalBase { 
    String name;

    public AnimalBase() {
        this.name = "Unknown Animal";
    }

    public AnimalBase(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends AnimalBase {
    String breed;

    public Dog() {
        super(); 
        this.breed = "Mixed";
    }

    public Dog(String name, String breed) {
        super(name); 
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }


    public void makeSound(int times) {
        System.out.println(name + " barks " + times + " times:");
        for (int i = 0; i < times; i++) {
            System.out.print("Woof! ");
        }
        System.out.println();
    }
}


public class Animal {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.makeSound(); 

        myDog.makeSound(3);
    }
}