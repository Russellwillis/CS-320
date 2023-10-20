import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

public class ContactTest 
{

	@Test
	public void testCreateContact() 
	{
		Contact contact = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		assertNotNull(contact);
	}

	@Test
	public void testContactID() 
	{
		Contact contact = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		assertEquals("A00001", contact.getContactID());
	}

	@Test
	public void testContactFN() 
	{
		Contact contact = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		assertEquals("Russell", contact.getFirstName());
	}

	@Test
	public void testContactLN() 
	{
		Contact contact = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		assertEquals("Willis", contact.getLastName());
	}

	@Test
	public void testContactPhone() 
	{
		Contact contact = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		assertEquals("8438263527", contact.getPhone());
	}

	@Test
	public void testContactAddress() 
	{
		Contact contact = new Contact("A00001", "Russell", "Willis", "8438263527", "123 myway street");
		assertEquals("123 myway street", contact.getAddress());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIDtooLong() {
		Contact contact = new Contact("A0000000001", "Russell", "Willis", "8438263527", "123 myway street");

	}
	@Test(expected = IllegalArgumentException.class)
	public void testIDNull() {
		Contact contact = new Contact(null, "Russell", "Willis", "8438263527", "123 myway street");

	}

	@Test(expected = IllegalArgumentException.class)
	public void testFNtooLong() {
		Contact contact = new Contact("A00001", "Russelllallllll", "Willis", "8438263527", "123 myway street");

	}
	@Test(expected = IllegalArgumentException.class)
	public void testFNNull() {
		Contact contact = new Contact("A00001", null, "Willis", "8438263527", "123 myway street");

	}

	@Test(expected = IllegalArgumentException.class)
	public void testLNtooLong() {
		Contact contact = new Contact("A00001", "Russell", "Willisssssss", "8438263527", "123 myway street");

	}
	@Test(expected = IllegalArgumentException.class)
	public void testLNNull() {
		Contact contact = new Contact("A00001", "Russell", null, "8438263527", "123 myway street");

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhonetooLong() {
		Contact contact = new Contact("A00001", "Russell", "Willisssssss", "18438263527", "123 myway street");

	}
	@Test(expected = IllegalArgumentException.class)
	public void testPhoneNull() {
		Contact contact = new Contact("A00001", "Russell", "willis", null, "123 myway street");

	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddresstooLong() {
		Contact contact = new Contact("A00001", "Russell", "Willisssssss", "8438263527", "123 myway street0000000000000000000000000000");

	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddressNull() {
		Contact contact = new Contact("A00001", "Russell", "willis", "8438263527", null);

	}

}
