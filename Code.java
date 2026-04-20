package myProjects;
 
import java.util.Scanner;
 
public class Person_Tasks_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main (String[] args){
 
		// Gather person information
		personClass person = new personClass();
		System.out.println("________Person Information________");
		System.out.print("First name: ");
		person.firstName = userinput.nextLine();
		System.out.print("Last name: ");
		person.lastName = userinput.nextLine();
		System.out.print("Gender: ");
		person.gender = userinput.nextLine();
		System.out.print("Age: ");
		person.age = userinput.nextInt();
		System.out.print("Weight (lbs): ");
		person.weight = userinput.nextDouble();
		System.out.print("Height (in): ");
		person.height = userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Ethnic Group: ");
		person.ethnicGroup = userinput.nextLine();
		System.out.print("Religion: ");
		person.religion = userinput.nextLine();
 
		// Loop through activities
		int choice = -1;
		while (choice != 0) {
			System.out.println("");
			System.out.println("1. Say a greeting");
			System.out.println("2. Say a prayer");
			System.out.println("3. Take a nap");
			System.out.println("4. Eat something");
			System.out.println("5. See name");
			System.out.println("6. Change religion");
			System.out.print("Select an activity for your person (type 0 to exit): ");
			choice = userinput.nextInt();
			userinput.nextLine(); // flush newline after nextInt()
 
			switch (choice) {
				case 1:
					person.sayGreeting();
					break;
				case 2:
					person.sayPrayer();
					break;
				case 3:
					person.takeNap();
					break;
				case 4:
					person.eat();
					break;
				case 5:
					person.getName();
					break;
				case 6:
					person.changeReligion();
					break;
				case 0:
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Please enter 0-6.");
			}
		}
	}
}

// Class that prints activities and saves data
class personClass {
 
	String firstName;
	String lastName;
	String gender;
	int age;
	double weight;
	double height;
	String ethnicGroup;
	String religion;
 
	void sayGreeting() {
		System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
	}
 
	void sayPrayer() {
		System.out.println(firstName + " bows their head and says a prayer.");
	}
 
	void takeNap() {
		System.out.println(firstName + " lays on their bed and takes a nap.");
	}
 
	void eat() {
		System.out.println(firstName + " goes to the table and eats a good meal.");
	}
 
	void getName() {
		System.out.println(firstName + " " + lastName);
	}
 
	void changeReligion() {
		System.out.print("Enter new religion: ");
		religion = Person_Tasks_App.userinput.nextLine();
		System.out.println("Religion updated to: " + religion);
	}
}
