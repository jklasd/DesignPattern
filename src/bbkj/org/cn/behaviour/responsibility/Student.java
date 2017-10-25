package bbkj.org.cn.behaviour.responsibility;

public class Student implements IStudent {

	private int state;
	private final String message;
	
	
	public Student(int state, String message) {
		this.state = state;
		this.message = message;
		System.out.println(message);
	}

	@Override
	public int getState() {
		return state;
	}

	@Override
	public String getRequestMessage() {
		return message;
	}

}
