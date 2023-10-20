import java.util.ArrayList;

public class TaskService 
{
	public static ArrayList<Task> tasks = new ArrayList<>();
	private static boolean alreadyT = false;

	public static boolean addTask(Task task) {
		for(Task tasklist : tasks) {
			if(tasklist.getTaskID().equals(task.getTaskID())) {
				alreadyT = true;
			}
		}
		if(!alreadyT) {
			tasks.add(task);
		}
		return alreadyT;
	}

	public static boolean deleteTask(Task task) {
		for(Task tasklist : tasks) {
			if(tasklist.getTaskID().equals(task.getTaskID())) {
				tasks.remove(task);
				return true;
			}
		}
		return false;
	}

	public static boolean updateTask(Task task) {
		for(Task tasklist : tasks) {
			if(tasklist.getTaskID().equals(task.getTaskID())) {
				tasklist.updateName(task.getTaskName());
				tasklist.updateDesc(task.getTaskDesc());
				return true;
			}
		}		
		return false;

	}



}
