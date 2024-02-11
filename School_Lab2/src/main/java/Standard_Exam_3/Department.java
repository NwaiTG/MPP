package Standard_Exam_3;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public abstract String getName();

	public void addMessage(String msg){
//		queue.add
	}
}