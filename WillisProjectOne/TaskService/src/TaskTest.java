import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class TaskTest {

	@Test 
	public void createValidTaskData() {
		Task task = new Task("1", "clean", "cleaning room");
		assertNotNull(task);
	}

	@Test
	public void testTaskID() 
	{
		Task task = new Task("A00001", "clean", "cleaning room");
		assertEquals("A00001", task.getTaskID());
	}

	@Test
	public void testTaskName() 
	{
		Task task = new Task("A00001", "clean", "cleaning room");
		assertEquals("clean", task.getTaskName());
	}

	@Test
	public void testTaskDesc() 
	{
		Task task = new Task("A00001", "clean", "cleaning room");
		assertEquals("cleaning room", task.getTaskDesc());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTaskIDNull() 
	{
		Task task = new Task(null, "clean", "cleaning room");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTaskIDlong() 
	{
		Task task = new Task("00000000000001", "clean", "cleaning room");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTaskNamelong() 
	{
		Task task = new Task("1", "clean000000000000000000000000000000", "cleaning room");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTaskNameNull() 
	{
		Task task = new Task("1", null, "cleaning room");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTaskDescNull() 
	{
		Task task = new Task("1", "clean", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTaskDesclong() 
	{
		Task task = new Task("1", "clean", "cleaning room00000000000000000000000000000000000000");
	}
}
