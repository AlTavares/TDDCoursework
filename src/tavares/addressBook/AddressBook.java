package tavares.addressBook;

import java.util.ArrayList;
import java.util.Date;

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

	public ArrayList<Entry> getByName(String name) {
		ArrayList<Entry> result = new ArrayList<Entry>();
		for (Entry entry : AddressList) {
			if (entry.getName().equals(name))
				result.add(entry);
		}
		return result;
	}

	public ArrayList<Entry> getByAddress(String address) {
		ArrayList<Entry> result = new ArrayList<Entry>();
		for (Entry entry : AddressList) {
			if (entry.getAddress().equals(address))
				result.add(entry);
		}
		return result;
	}

	public ArrayList<Entry> getByPhone(String phone) {
		ArrayList<Entry> result = new ArrayList<Entry>();
		for (Entry entry : AddressList) {
			if (entry.getPhone().equals(phone))
				result.add(entry);
		}
		return result;
	}

	public ArrayList<Entry> getByBirthday(int day, int month, int year) {
		ArrayList<Entry> result = new ArrayList<Entry>();
		Date date = new Date(year, month, day);
		for (Entry entry : AddressList) {
			if (entry.getBirthday().equals(date))
				result.add(entry);
		}
		return result;
	}
}
