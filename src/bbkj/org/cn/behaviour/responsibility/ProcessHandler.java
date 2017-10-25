package bbkj.org.cn.behaviour.responsibility;

public class ProcessHandler {
	private final IHandler squadhandler;
	private final IHandler teacherhandler;
	private final IHandler schoolhandler;
	
	private static ProcessHandler handler = new ProcessHandler();
	private ProcessHandler(){
		schoolhandler = new SchoolMasterHandler();
		
		teacherhandler = new TeacherHandler();
		teacherhandler.setHandler(schoolhandler);
		
		squadhandler = new SquadLeaderHandler();
		squadhandler.setHandler(teacherhandler);
	}
	
	public static ProcessHandler getInstance(){
		return handler;
	}
	
	public void sendMessage(IStudent student){
		//发送信息，请求班长处理
		squadhandler.handlerRequest(student);
	}
}
