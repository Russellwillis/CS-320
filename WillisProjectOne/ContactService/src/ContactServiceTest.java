import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ContactServiceTest 
{
	@SuppressWarnings("unused")
	private ContactService contactService;

	@Before
	public void setUp() 
	{
		contactService = new ContactService();
	}
	
	@Test
	public void testAdd() {
	Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
	assertTrue(ContactService.addContact(test1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void noDoubleIDTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
	ContactService.addContact(test1);
	Contact test2 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
	assertNull(ContactService.addContact(test2));
	}

	@Test
	public void deleteTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
	assertEquals(true, ContactService.deleteContact("A00001"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteNonExistentContact() 
	{
		assertNull(ContactService.deleteContact("B123456789"));
	}

	@Test
	public void updateFNTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateFN("A00001", "Russ"));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatenullFNTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateFN("A00001", null));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatelongFNTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateFN("A00001", "Russellllll"));
	}
	
	@Test
	public void updateLNTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateLN("A00001", "Russ"));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatenullLNTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateLN("A00001", null));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatelongLNTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateLN("A00001", "Russellllll"));
	}
	
	@Test
	public void updatePhoneTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateNumber("A00001", "8438263526"));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatenullPhoneTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateNumber("A00001", null));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatelongPhoneTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateNumber("A00001", "18438263527"));
	}
	
	@Test
	public void updateAddressTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateAddress("A00001", "123 myway streets"));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatenullAddressTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateAddress("A00001", null));
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void updatelongAddressTest() {
		Contact test1 = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		ContactService.addContact(test1);
		assertEquals(true, ContactService.updateAddress("A00001", "01234567891123456789212345678930"));
	}
	
	
}
