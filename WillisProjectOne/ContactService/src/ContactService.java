import java.util.ArrayList;

public class ContactService
{
	public static ArrayList<Contact> contacts ;

	public ContactService() 
	{
		contacts = new ArrayList<>();
	}

	public static boolean addContact(Contact contact) 
	{
		if(contact == null) 
		{
			throw new IllegalArgumentException("Contact must not be null");
		}

		for(Contact existingContact : contacts) 
		{
			if (existingContact.getContactID().equals(contact.getContactID())) 
			{
				throw new IllegalArgumentException("Contact ID must be unique");
			}
		}

		contacts.add(contact);
		return true;
	}

	public static boolean deleteContact(String contactID) 
	{
		if(contactID == null) 
		{
			throw new IllegalArgumentException("Contact must not be null");
		}

		for(Contact contact : contacts) 
		{
			if(contact.getContactID().equals(contactID)) 
			{
				contacts.remove(contact);
				return true;
			}
		}
		throw new IllegalArgumentException("Contact not found");
	}

	public static boolean updateFN(String contactID, String firstName) 
	{
		if(contactID == null) 
		{
			throw new IllegalArgumentException("Contact must not be null");
		}

		for(Contact contact : contacts) 
		{
			if(contact.getContactID().equals(contactID)) 
			{
				contact.updateFirstName(firstName);
				return true;
			}
		}
		throw new IllegalArgumentException("Contact not found");
	}

	public static boolean updateLN(String contactID, String lastName) 
	{
		if(contactID == null) 
		{
			throw new IllegalArgumentException("Contact must not be null");
		}

		for(Contact contact : contacts) 
		{
			if(contact.getContactID().equals(contactID)) 
			{
				contact.updateLastName(lastName);
				return true;
			}
		}
		throw new IllegalArgumentException("Contact not found");
	}

	public static boolean updateNumber(String contactID, String number) 
	{
		if(contactID == null) 
		{
			throw new IllegalArgumentException("Contact must not be null");
		}

		for(Contact contact : contacts) 
		{
			if(contact.getContactID().equals(contactID)) 
			{
				contact.updatePhoneNumber(number);
				return true;
			}
		}
		throw new IllegalArgumentException("Contact not found");
	}

	public static boolean updateAddress(String contactID, String address) 
	{
		if(contactID == null) 
		{
			throw new IllegalArgumentException("Contact must not be null");
		}

		for(Contact contact : contacts) 
		{
			if(contact.getContactID().equals(contactID)) 
			{
				contact.updateAddress(address);
				return true;
			}
		}
		throw new IllegalArgumentException("Contact not found");
	}

}

