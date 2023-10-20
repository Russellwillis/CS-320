import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskServiceTest {
	@Test
	public void testAdd() {
		Task test1 = new Task("123", "clean", "clean");
		assertEquals(false, TaskService.addTask(test1));
	}

	@Test
	public void noDoubleIDTest() {
		Task test1 = new Task("123", "clean", "clean");
		TaskService.addTask(test1);
		Task test2 = new Task("123", "cook", "cook");
		assertEquals(true, TaskService.addTask(test2));
	}

	@Test
	public void deleteTest() {
		Task test1 = new Task("123", "clean", "clean");
		TaskService.addTask(test1);
		assertEquals(true, TaskService.deleteTask(test1));
	}

	@Test
	public void updateTest() {
		Task test1 = new Task("123", "clean", "clean");
		TaskService.addTask(test1);
		Task test2 = new Task("123", "cook", "cook");
		TaskService.updateTask(test2);
	}

}

