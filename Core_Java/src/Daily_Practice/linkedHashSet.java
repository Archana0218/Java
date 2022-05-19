package Daily_Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {

LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add("Hi");
lhs.add("Hello");
lhs.add("hi");
lhs.add("Is");
lhs.add("Very helpful");

Iterator<String> itr =lhs.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
