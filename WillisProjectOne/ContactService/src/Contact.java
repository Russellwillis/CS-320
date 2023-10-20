
public class Contact 
{
	String contactID;
	String firstName;
	String lastName;
	String phone;
	String address;


	//CONSTRUCTOR
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {

		if(contactID == null || contactID.length() > 10) 
		{
			throw new IllegalArgumentException("Invalid Contact Id");
		}

		if(firstName == null || firstName.length() > 10) 
		{
			throw new IllegalArgumentException("Invalid Appointment Id");
		}

		if(lastName == null || lastName.length() > 10) 
		{
			throw new IllegalArgumentException("Invalid Appointment Id");
		}

		if(phone == null || phone.length() != 10) 
		{
			throw new IllegalArgumentException("Invalid Appointment Id");
		}

		if(address == null || address.length() >30) 
		{
			throw new IllegalArgumentException("Invalid Appointment Id");
		}

		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	//GETTERS
	public String getContactID() 
	{
		return contactID;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public String getPhone() 
	{
		return phone;
	}


	public String getAddress() 
	{
		return address;
	}

	public void updateFirstName(String firstName)
	{
		if (firstName == null) 
		{
			throw new IllegalArgumentException("First name cannot be empty");
		} 
		else if (firstName.length() > 10) 
		{
			throw new IllegalArgumentException("First name cannot be longer than " + "10" + " characters");
		} 
		else 
		{
			this.firstName = firstName;
		}
	}

	public void updateLastName(String lastName) 
	{
		if (lastName == null) 
		{
			throw new IllegalArgumentException("Last name cannot be empty");
		}
		else if (lastName.length() > 10) 
		{
			throw new IllegalArgumentException("Last name cannot be longer than " +"10" + " characters");
		} 
		else 
		{
			this.lastName = lastName;
		}
	}

	public void updatePhoneNumber(String phone) 
	{
		if (phone == null) 
		{
			throw new IllegalArgumentException("Phone number cannot be empty.");
		} 
		else if (phone.length() != 10) 
		{
			throw new IllegalArgumentException(
					"Phone number length invalid. Ensure it is " +"10" + " digits.");
		} 
		else 
		{
			this.phone = phone;
		}
	}

	public void updateAddress(String address) 
	{
		if (address == null) 
		{
			throw new IllegalArgumentException("Address cannot be empty");
		} 
		else if (address.length() > 30) 
		{
			throw new IllegalArgumentException("Address cannot be longer than " + "30" +" characters");
		} 
		else 
		{
			this.address = address;
		}
	}


}

