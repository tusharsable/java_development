import java.util.InputMismatchException;
import java.util.Scanner;

//define address class to store required data

public class Address {

	//Main method to start execution
	public static void main(String[] args) {
		//make a new Address book
		Address_book address_book1 = new Address_book();
		//initialize user choice
		int user_choice=4;
		//run loop till the user wants to continue
		while (true) {

			//Dispplay menu for user to choose from
			System.out.println("Welcome to the address book program");
			System.out.println("Enter 1 to add new entry to the address book");
			System.out.println("Enter 2 to view entry to the address book");
			System.out.println("Enter 3 to delete entry new entry to the address book");
			System.out.println("Enter 4 to exit program");

			//get user choice
			user_choice=Address.get_input();

			//do according to user choice
			switch(user_choice) {

				//add new entry to address book
				case 1: {
					Address_entry address = new Address_entry();
					address_book1.addressList.add(address);
					break;
				}

				//view a address book
				case 2:{
					address_book1.print_all();
					break;
				}

				//remove a entry from address book
				case 3:{
					address_book1.print_all();
					System.out.println("Please enter the 'Entry number' to remove");
					user_choice=Address.get_input();
					address_book1.remove_entry(user_choice-1);
					break;
				}

				//exit program
				case 4: {
					System.exit(0);
				}

				//prompt user to enter a correct choice
				default: {
					System.out.println("Please enter a correct number");
				}
			}
		
		}
	}

	//get a proper choice from user
	public static int get_input() {

		//initialize user choice
		int user_choice=0;

		//run till the user enters a correct value
		while (true) {
			try {

				//try to get a integer value and catch any wrong value
				Scanner user_input = new Scanner(System.in);
				user_choice=user_input.nextInt();
				}catch (InputMismatchException e) {

					//prompt user to input correct number
					System.out.println("Please enter a correct number");
					//continue the loop for next input
				 	continue;
				}
			//return user choice
			return user_choice;
		}	
	}
}
