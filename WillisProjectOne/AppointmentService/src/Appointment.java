import java.util.Date;

public class Appointment 
{
	private String appointmentID = "";
	private Date appointmentDate;
	private String description = "";

	public Appointment(String appointmentID, Date appointmentDate, String description) 
	{
		if(appointmentID == null || appointmentID.length() > 10) 
		{
			throw new IllegalArgumentException("Invalid Appointment Id");
		}
		if (appointmentDate == null || appointmentDate.before(new Date()))
		{
			throw new IllegalArgumentException("Appointment date must not be null and cannot be in the past");
		}

		if(description == null || description.length() > 50) 
		{
			throw new IllegalArgumentException("Invalid Description");
		}

		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}

	public String getAppointmentID() 
	{
		return appointmentID;
	}

	public Date getAppointmentDate() 
	{
		return appointmentDate;
	}

	public String getDescription() 
	{
		return description;
	}

}
