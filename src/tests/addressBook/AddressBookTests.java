package tests.addressBook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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

		assertTrue(addressBook.getByName("Alexandre").contains(entry));
		assertFalse(addressBook.getByName("Alexandre").contains(entry2));
		assertTrue(addressBook.getByName("Tavares").contains(entry2));
		assertFalse(addressBook.getByName("Tavares").contains(entry));
		assertEquals(0, addressBook.getByName("NameThatDoesntExist").size());

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

		assertTrue(addressBook.getByAddress("St Mary's College").contains(entry));
		assertFalse(addressBook.getByAddress("St Mary's College").contains(entry2));
		assertTrue(addressBook.getByAddress("Henderson Hall").contains(entry2));
		assertFalse(addressBook.getByAddress("Henderson Hall").contains(entry));
		assertEquals(0, addressBook.getByAddress("AddressThatDoesntExist").size());

	}

	@Test
	public void getEntryByPhoneNumber() {
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

		assertTrue(addressBook.getByPhone("09922351258").contains(entry));
		assertFalse(addressBook.getByPhone("09922351258").contains(entry2));
		assertTrue(addressBook.getByPhone("02234455446").contains(entry2));
		assertFalse(addressBook.getByPhone("02234455446").contains(entry));
		assertEquals(0, addressBook.getByPhone("NotEvenANumberLOL").size());

	}

	@Test
	public void getEntryByPhoneBirthday() {
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

		assertTrue(addressBook.getByBirthday(20, 9, 1993).contains(entry));
		assertFalse(addressBook.getByBirthday(20, 9, 1993).contains(entry2));
		assertTrue(addressBook.getByBirthday(23, 10, 1990).contains(entry2));
		assertFalse(addressBook.getByBirthday(23, 10, 1990).contains(entry));
		assertEquals(0, addressBook.getByBirthday(11, 9, 2001).size());

	}

	@Test
	public void testIfEntryIdIncrementsToBeUnique() {
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

		assertEquals(entry.getID(), entry2.getID() - 1);

	}

	@Test
	public void getAllItemsInTheAddressBook() {
		ArrayList<Entry> entryList = new ArrayList<Entry>();

		Entry entry = new Entry();
		entry.setName("Alexandre");
		entry.setAddress("St Mary's College");
		entry.setPhone("09922351258");
		entry.setBirthday(20, 9, 1993);
		addressBook.add(entry);
		entryList.add(entry);

		Entry entry2 = new Entry();
		entry2.setName("Mantovani");
		entry2.setAddress("Newcastle");
		entry2.setPhone("02234457656");
		entry2.setBirthday(13, 5, 1980);
		addressBook.add(entry2);
		entryList.add(entry2);

		Entry entry3 = new Entry();
		entry3.setName("Tavares");
		entry3.setAddress("Henderson Hall");
		entry3.setPhone("02234455446");
		entry3.setBirthday(23, 10, 1990);
		addressBook.add(entry3);
		entryList.add(entry3);

		addressBook.getAddresses().containsAll(entryList);

	}
}
