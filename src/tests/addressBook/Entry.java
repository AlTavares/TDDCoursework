package tests.addressBook;

import java.util.Date;

public class Entry {
	private int ID;
	private String Name, Address, Phone;
	private Date Birthday;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public Entry() {
		// TODO Auto-generated constructor stub
	}
}
