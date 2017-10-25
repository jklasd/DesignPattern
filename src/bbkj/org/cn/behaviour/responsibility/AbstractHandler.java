package bbkj.org.cn.behaviour.responsibility;

public abstract class AbstractHandler implements IHandler {

	private IHandler handler;
	
	private int state = -1;
	
	public AbstractHandler(int state){
		this.state = state;
	}
	
	@Override
	public void handlerRequest(IStudent student) {
		// TODO Auto-generated method stub
		if(student!=null){
			if(this.state == student.getState()){
//				System.out.println("级别对应，处理当前请求");
				this.process(student);
			}else{
				if(this.handler != null){
					System.out.println("请求上级处理");
					handler.handlerRequest(student);
				}
			}
		}
	}

	protected abstract void process(IStudent student);

	@Override
	public void setHandler(IHandler handler) {
		// TODO Auto-generated method stub
		this.handler = handler;
	}

}
