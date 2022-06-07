package Daily_Practice;
import java.util.ArrayList;
import java.util.List;
public class StreamCountMethod {

	public static void main(String[] args) {
		
List<String> namelist=new ArrayList();
namelist.add("INDIA");
namelist.add("RUSSIA");
namelist.add("AMERICA");
namelist.add("AUSTRELIA");
namelist.add("ENLAND");
Long count =namelist.stream().filter(s -> s.length()>5).count();
System.out.println("total name with more than 5 is :  "+ count);
	}

}
