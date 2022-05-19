package Daily_Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("Hi");
	ts.add("For");
	ts.add("u");
	ts.add("Hello");
	ts.add("Bye");
	System.out.println(ts);
	Iterator<String> itr= ts.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	}

}
