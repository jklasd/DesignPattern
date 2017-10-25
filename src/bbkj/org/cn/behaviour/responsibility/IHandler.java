package bbkj.org.cn.behaviour.responsibility;

public interface IHandler {
	public void handlerRequest(IStudent student);
	
	public void setHandler(IHandler handler);
}
