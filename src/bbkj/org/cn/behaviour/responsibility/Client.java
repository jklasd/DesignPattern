package bbkj.org.cn.behaviour.responsibility;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0;i<5;i++){
			int state = random.nextInt(3);
			IStudent student = new Student(state,"学生"+i+"请假");
			ProcessHandler.getInstance().sendMessage(student);
		}
	}
}
