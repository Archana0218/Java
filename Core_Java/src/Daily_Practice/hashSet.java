package Daily_Practice;

import java.util.*;

public class hashSet {

	public static void main(String[] args) {
		// Creating HashSet and Adding elements
		HashSet<String> hs=new HashSet<String>();
		hs.add("this is ");
		hs.add("for");
		hs.add("me");
		hs.add("Is");
		hs.add("Very helpful");
		//Traversing element
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
