package tavares.addressBook;

import java.util.ArrayList;

import tests.addressBook.Entry;

public class AddressBook {
	ArrayList<Entry> AddressList;

	public AddressBook() {
		// TODO Auto-generated constructor stub
		AddressList = new ArrayList<Entry>();
	}

	public void add(Entry entry) {
		this.AddressList.add(entry);

	}

	public ArrayList<Entry> getAddresses() {
		return AddressList;
	}

	public int size() {
		return this.AddressList.size();
	}

	public Entry getByName(String name) {
		for (Entry entry : AddressList) {
			if (entry.getName().equals(name))
				return entry;
		}
		return null;
	}

	public Entry getByAddress(String address) {
		for (Entry entry : AddressList) {
			if (entry.getAddress().equals(address))
				return entry;
		}
		return null;
	}
}
