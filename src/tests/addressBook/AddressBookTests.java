package tests.addressBook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import tavares.addressBook.AddressBook;

import com.example.tddCoursework.AbstractLoggingJUnitTest;

public class AddressBookTests extends AbstractLoggingJUnitTest {
	private AddressBook addressBook;

	@Before
	public void createNewAddressBook() {
		addressBook = new AddressBook();
	}

	@Test
	public void newAddressBookShouldReturnAnEmptyArrayList() {
		assertEquals(0, addressBook.getAddresses().size());
	}

	@Test
	public void addNewEntry() {
		Entry entry = new Entry();
		entry.setName("Alexandre");
		entry.setAddress("St Mary's College");
		entry.setPhone("09922351258");
		entry.setBirthday(20, 9, 1993);
		int addressBookSize = addressBook.size();
		addressBook.add(entry);
		assertEquals(addressBookSize + 1, addressBook.size());
	}

	@Test
	public void getEntryByName() {
		Entry entry = new Entry();
		entry.setName("Alexandre");
		entry.setAddress("St Mary's College");
		entry.setPhone("09922351258");
		entry.setBirthday(20, 9, 1993);
		addressBook.add(entry);

		Entry entry2 = new Entry();
		entry2.setName("Tavares");
		entry2.setAddress("Henderson Hall");
		entry2.setPhone("02234455446");
		entry2.setBirthday(23, 10, 1990);
		addressBook.add(entry2);

		assertEquals(entry, addressBook.getByName("Alexandre"));
		assertEquals(entry2, addressBook.getByName("Tavares"));
		assertNull(addressBook.getByName("NameThatDoesntExist"));

	}

	@Test
	public void getEntryByAddress() {
		Entry entry = new Entry();
		entry.setName("Alexandre");
		entry.setAddress("St Mary's College");
		entry.setPhone("09922351258");
		entry.setBirthday(20, 9, 1993);
		addressBook.add(entry);

		Entry entry2 = new Entry();
		entry2.setName("Tavares");
		entry2.setAddress("Henderson Hall");
		entry2.setPhone("02234455446");
		entry2.setBirthday(23, 10, 1990);
		addressBook.add(entry2);

		assertEquals(entry, addressBook.getByAddress("St Mary's College"));
		assertEquals(entry2, addressBook.getByAddress("Henderson Hall"));
		assertNull(addressBook.getByAddress("AddressThatDoesntExist"));

	}

}
