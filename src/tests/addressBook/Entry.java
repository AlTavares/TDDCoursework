package tests.addressBook;

import java.util.Date;

public class Entry {
	private final int ID;
	private static int LAST_ID = 0;
	private String Name, Address, Phone;
	private Date Birthday;

	public Entry() {
		// TODO Auto-generated constructor stub
		ID = LAST_ID;
		LAST_ID++;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(int day, int month, int year) {
		Birthday = new Date(year, month, day);
	}

}
