//Import the utility class
import java.util.*; 

public class Address_book {
 
    List<Address_entry> addressList;
	Address_book(Address_entry entry) {

		// create a list to store new address entries
		List<Address_entry> addressList = new ArrayList<Address_entry>();
		addressList.add(entry);

	}

	public void add_entry(Address_entry entry) {

		this.addressList.add(entry);

	}

}