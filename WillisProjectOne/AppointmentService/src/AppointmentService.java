import java.util.ArrayList;

public class AppointmentService 
{
	public static ArrayList<Appointment> appointments ;

	public AppointmentService() 
	{
		appointments = new ArrayList<>();
	}

	public static boolean addAppointment(Appointment appointment) 
	{
		if(appointment == null) 
		{
			throw new IllegalArgumentException("Appointment must not be null");
		}

		for(Appointment existingAppointment : appointments) 
		{
			if (existingAppointment.getAppointmentID().equals(appointment.getAppointmentID())) 
			{
				throw new IllegalArgumentException("Appointment ID must be unique");
			}
		}

		appointments.add(appointment);
		return true;
	}

	public boolean deleteAppointment(String appointmentID) 
	{
		if(appointmentID == null) 
		{
			throw new IllegalArgumentException("Appointment must not be null");
		}

		for(Appointment appointment : appointments) 
		{
			if(appointment.getAppointmentID().equals(appointmentID)) 
			{
				appointments.remove(appointment);
				return true;
			}
		}
		throw new IllegalArgumentException("Appointment not found");
	}



}
