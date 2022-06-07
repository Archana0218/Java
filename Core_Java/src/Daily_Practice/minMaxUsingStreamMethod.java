package Daily_Practice;

import java.util.ArrayList;
import java.util.List;

public class minMaxUsingStreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numbers=new ArrayList<>();
numbers.add(14);
numbers.add(4);
numbers.add(11);
numbers.add(28);
numbers.add(99);
numbers.add(7);
Integer minnum=numbers.stream().min((s1,s2)->s1.compareTo(s2)).get();
System.out.println("Minimum number value in List is :"+minnum);
Integer mixnum=numbers.stream().max((s1,s2)->s1.compareTo(s2)).get();
System.out.println("Miximum number value in List is :"+mixnum);	}

}
