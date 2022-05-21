package Daily_Practice;

import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> stack =new Stack<String>();
stack.push("hi");
stack.push("hello");
stack.push("bye");
stack.push("gm");

Iterator<String> itr=stack.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next()+"");
}
System.out.println();
stack.pop();
itr=stack.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next()+"");
}
	}

}
