package bbkj.org.cn.behaviour.iterator;

public class Client {
	public static void main(String[] args) {
		IPersonList plist = new PersonList();
		
		Iterator iterator = plist.iterator();
		while(iterator.hasNext()){
			IPerson person = (IPerson) iterator.next();
			System.out.println(person.getPersonInfo());
		}
	}
}
