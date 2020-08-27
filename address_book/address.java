import java.util.InputMismatchException;
import java.util.Scanner;

//define address class to store required data

public class address {

	public static void main(final String[] args) {
		Address_book address_book1 = new Address_book();
		int user_choice=4;
		while (true) {
			System.out.println("Welcome to the address book program");
			System.out.println("Enter 1 to add new entry to the address book");
			System.out.println("Enter 2 to view entry to the address book");
			System.out.println("Enter 3 to delete entry new entry to the address book");
			System.out.println("Enter 4 to exit program");
			try {
			Scanner user_input = new Scanner(System.in);
			user_choice=user_input.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Please enter a correct choice");
				continue;
			}
			switch(user_choice) {

				case 1: {
					Address_entry address = new Address_entry();
					address_book1.addressList.add(address);
					break;
				}
				case 2:{
					address_book1.print_all();
					break;
				}
				case 3:{
					address_book1.addressList.remove(0);
					break;
				}
				case 4: {
					System.exit(0);
				}
				default: {
					System.out.println("Please enter a correct choice");
				}
			}
		
		}
		/*Address_entry address = new Address_entry();
		Address_book address_book1 = new Address_book(address);
		*/
		

			
	}
}