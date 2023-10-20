import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

public class AppointmentTest 
{
	@Test
	public void testCreateAppointment() 
	{
		Appointment appointment = new Appointment("A00001", new Date(), "Appointment Description");
		assertNotNull(appointment);
	}

	@Test
	public void testAppointmentID() 
	{
		Appointment appointment = new Appointment("A00001", new Date(), "Appointment Description");
		assertEquals("A00001", appointment.getAppointmentID());
	}

	@Test
	public void testAppointmentDate() 
	{
		Date appointmentDate = new Date();
		Appointment appointment = new Appointment("A00001", appointmentDate, "Appointment Description");
		assertEquals(appointmentDate, appointment.getAppointmentDate());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAppointmentDateInThePast() 
	{
		Date appointmentDate = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
		Appointment appointment = new Appointment("A00001", appointmentDate, "Appointment Description");
		assertEquals(appointmentDate, appointment.getAppointmentDate());
	}

	@Test
	public void testAppointmentDescription() 
	{
		Appointment appointment = new Appointment("A00001", new Date(), "Appointment Description");
		assertEquals("Appointment Description", appointment.getDescription());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAppointmentIDTooLong() 
	{
		Appointment appointment = new Appointment("A0000000001", new Date(), "Appointment Description");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAppointmentIDNull() 
	{
		Appointment appointment = new Appointment(null, new Date(), "Appointment Description");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAppointmentDateNull() 
	{
		Appointment appointment = new Appointment("A00001", null, "Appointment Description");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAppointmentDescriptionNull() 
	{
		Appointment appointment = new Appointment("A00001", new Date(), null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAppointmentDescriptionTooLong() 
	{
		String description = "Appointment Description that is too long and should throw an IllegalArgumentException";
		Appointment appointment = new Appointment("A00001", new Date(), description);
	}
}
