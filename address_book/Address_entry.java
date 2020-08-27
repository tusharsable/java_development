//Import the utility class
import java.util.*; 


public class Address_entry {

	String name,address,city,state,zip,phone_number ;
	//define constructor to initialize object
	Address_entry() {

		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);

		// Get name form user
        System.out.println("enter your name");
        this.name = myObj.nextLine();

		// Get address from user
		System.out.println("enter your address");
		this.address = myObj.nextLine(); // Read user input

		// Get city from user
		System.out.println("enter your city");
		this.city = myObj.nextLine(); // Read user input

		// Get state from user
		System.out.println("enter your state");
		this.state = myObj.nextLine(); // Read user input

		// Get zip code from user
		System.out.println("enter your Zip code");
		this.zip = myObj.nextLine(); // Read user input

		// Get phone number from user
		System.out.println("enter your phone number");
		this.phone_number = myObj.nextLine(); // Read user input

        
    }
    public void print_entry() {
        System.out.println("name		city	state	ZipCode	Phone_number");
		System.out.println(this.name+"\t\t"+this.city+"\t"+this.state+"\t"+this.zip+"\t"+this.phone_number);
		
    }
	
}