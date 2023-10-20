
public class Task 
{
	private String taskId = "";
	private String taskName = "";
	private String taskDesc = "";

	public Task(String taskId, String taskName, String taskDesc) {

		if( taskId == null|| taskId.length() > 10 ) {
			throw new IllegalArgumentException("Invalid Task Id");
		}
		if(taskName == null || taskName.length() >20 ) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		if(taskDesc == null || taskDesc.length() > 50 ) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
	}

	//getters
	public String getTaskID() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	//updates

	public void updateName(String taskName) {
		this.taskName = taskName;

	}

	public void updateDesc(String taskDesc) {
		this.taskDesc = taskDesc;

	}
}
