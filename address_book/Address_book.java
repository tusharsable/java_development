//Import the utility class
import java.util.*; 

public class Address_book {
 
	List<Address_entry> addressList;
	Address_book() {

		// create a list to store new address entries
		this.addressList = new ArrayList<Address_entry>();
		

	}

	public void add_entry(Address_entry entry) {
		//add entry to address book
		this.addressList.add(entry);

	}	
	
	public void remove_entry(int entry) {
		//remove entry to address book
		try{
			this.addressList.remove(entry);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Please enter a correct number");
		}
	}


	public void print_all() {
		//get length of array
		int length = this.addressList.size();

		//display all entries
		for (int i=0;i<length;i++){
			System.out.println("Entry number : "+(i+1));
			addressList.get(i).print_entry();
		}
	}
}