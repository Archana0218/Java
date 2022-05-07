package Daily_Practice;

import java.util.ArrayList;
import java.util.List;

public class array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		System.out.println("adding element to end of list");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("G");
		System.out.println("ArrayList insertaion: " + list);
		System.out.println("Adding an element at a specific index after B element: ");
		list.add(2,"C");
		System.out.println("ArrayList inseration order adding C:"+list);
		System.out.println("adding an element at a specfic index after E");
	}

}
