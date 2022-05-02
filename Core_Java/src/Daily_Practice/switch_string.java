package Daily_Practice;

public class switch_string {
	
	public static void main(String[] args)
	{
	String name = "team";
 switch(name.toLowerCase())
 {
 case"author":
	 System.out.println("vikas");
	 break;
 case "team":
	 System.out.println("Team Java Full stack");
	 break;
 case "editor":
	 System.out.println("Vishnu & Krishan");
	 break;
	 default:
		 System.out.println("Invalid entry");
		 break;
 }
 }
}
