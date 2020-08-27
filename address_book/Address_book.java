//Import the utility class
import java.util.*; 

public class Address_book {
 
	List<Address_entry> addressList;
	Address_book() {

		// create a list to store new address entries
		this.addressList = new ArrayList<Address_entry>();
		

	}

	public void add_entry(Address_entry entry) {

		this.addressList.add(entry);

	}

	public void print_all() {
		int length = this.addressList.size();
		for (int i=0;i<length;i++){
			System.out.println("Entry number : "+(i+1));
			addressList.get(i).print_entry();
		}
	}
}