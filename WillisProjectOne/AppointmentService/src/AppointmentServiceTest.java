import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class AppointmentServiceTest 
{
	private AppointmentService appointmentService;

	@Before
	public void setUp() 
	{
		appointmentService = new AppointmentService();
	}

	@Test
	public void testAddAppointment() 
	{
		Appointment appointment = new Appointment("A123456789", new Date(), "Test Appointment");
		assertTrue(AppointmentService.addAppointment(appointment));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddDuplicateAppointment() 
	{
		Appointment appointment1 = new Appointment("A123456789", new Date(), "Test Appointment 1");
		Appointment appointment2 = new Appointment("A123456789", new Date(), "Test Appointment 2");
		AppointmentService.addAppointment(appointment1);
		assertNull(AppointmentService.addAppointment(appointment2));
	}

	@Test
	public void testDeleteAppointment() 
	{
		Appointment appointment = new Appointment("A123456789", new Date(), "Test Appointment");
		AppointmentService.addAppointment(appointment);
		assertTrue(appointmentService.deleteAppointment("A123456789"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDeleteNonExistentAppointment() 
	{
		assertNull(appointmentService.deleteAppointment("B123456789"));
	}

}
