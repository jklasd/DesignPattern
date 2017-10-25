package bbkj.org.cn.behaviour.iterator;

import java.util.ArrayList;

public class PersonIterator implements Iterator {

	private int index = -1;
	
	private ArrayList<IPerson> list;
	
	public PersonIterator(ArrayList<IPerson> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return list!=null && index < list.size()-1;
	}

	@Override
	public Object next() {
		if(list!=null){
			index++ ;
			// TODO Auto-generated method stub
			return list.get(index);
		}
		return null;
	}

	@Override
	public Object remove() {
		if(list!=null){
			// TODO Auto-generated method stub
			return list.remove(index);
		}
		return null;
	}

}
