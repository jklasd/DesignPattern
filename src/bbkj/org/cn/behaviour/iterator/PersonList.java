package bbkj.org.cn.behaviour.iterator;

import java.util.ArrayList;
import java.util.Random;

public class PersonList implements IPersonList {

	private ArrayList<IPerson> list = new ArrayList<IPerson>();
	
	public PersonList() {
		Random random = new Random();
		
		for(int i=0 ;i<10 ;i++){
			IPerson person = new Person("人员"+i, random.nextInt(30), random.nextInt(2));
			list.add(person);
		}
	}
	
	@Override
	public ArrayList<IPerson> getPersonList() {
		// TODO Auto-generated method stub
		return this.list;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new PersonIterator(list);
	}

}
