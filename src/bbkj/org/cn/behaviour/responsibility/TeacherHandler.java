package bbkj.org.cn.behaviour.responsibility;

public class TeacherHandler extends AbstractHandler {

	public TeacherHandler() {
		super(1);
	}

	@Override
	protected void process(IStudent student) {
		// TODO Auto-generated method stub
		System.out.println(TeacherHandler.class.getName()+"处理");
	}

}
