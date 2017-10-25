package bbkj.org.cn.behaviour.iterator;

import java.util.ArrayList;

public interface IPersonList {
	public ArrayList<IPerson> getPersonList();
	
	public Iterator iterator();
}
