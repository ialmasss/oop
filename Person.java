package week3;
import java.util.*;

class PersonBase {
    private String name;
    private String address;

    public PersonBase(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}

class Student extends PersonBase {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}

class Staff extends PersonBase {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}


public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<PersonBase> people = new HashSet<>(); 

        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Print all");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            if(!sc.hasNextInt()) break; 
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Type (1-Person, 2-Student, 3-Staff): ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();

                if (type == 1) {
                    people.add(new PersonBase(name, address));
                } else if (type == 2) {
                    System.out.print("Program: "); String prog = sc.nextLine();
                    System.out.print("Year: "); int year = sc.nextInt();
                    System.out.print("Fee: "); double fee = sc.nextDouble();
                    people.add(new Student(name, address, prog, year, fee));
                } else if (type == 3) {
                    System.out.print("School: "); String school = sc.nextLine();
                    System.out.print("Pay: "); double pay = sc.nextDouble();
                    people.add(new Staff(name, address, school, pay));
                }
                System.out.println("Added successfully!");

            } else if (choice == 2) {
                System.out.println("\nList of all:");
                for (PersonBase p : people) {
                    System.out.println(p);
                }
            } else {
                break;
            }
        }
    }
}