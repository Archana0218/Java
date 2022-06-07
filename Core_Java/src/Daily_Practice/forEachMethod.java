package Daily_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class forEachMethod {

	public static void main(String[] args) {
ArrayList<Integer> l1=new ArrayList<Integer>();
l1.add(0);
l1.add(15);
l1.add(10);
l1.add(22);
l1.add(13);
l1.add(32);
List<Integer>l2=l1.stream().map(i-> i+10).collect(Collectors.toList());
l2.stream().forEach(i ->System.out.println(i+ " "));
System.out.println(" ");
l2.stream().forEach(System.out::println);
	}

}
