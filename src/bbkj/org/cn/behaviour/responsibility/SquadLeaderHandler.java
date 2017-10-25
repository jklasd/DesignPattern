package bbkj.org.cn.behaviour.responsibility;

public class SquadLeaderHandler extends AbstractHandler {

	public SquadLeaderHandler() {
		super(0);
	}

	@Override
	protected void process(IStudent student) {
		System.out.println(SquadLeaderHandler.class.getName()+"处理");
	}

}
