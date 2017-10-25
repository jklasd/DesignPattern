package bbkj.org.cn.behaviour.responsibility;

public class SchoolMasterHandler extends AbstractHandler {

	public SchoolMasterHandler() {
		super(2);
	}

	@Override
	protected void process(IStudent student) {
		System.out.println(SchoolMasterHandler.class.getName()+"处理");
	}

}
