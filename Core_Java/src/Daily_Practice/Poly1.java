package Daily_Practice;



class stud
{
	void studinfo(int marks, String name)
	{
		
		System.out.println("Student info :"+marks+" "+name);
		
		
	}
	void dept()
	{
		System.out.println("computer engg");
	}
	
}
public class Poly1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud st=new stud();
		st.studinfo(70, "archana");
		st.studinfo(60, "arohi");
		st.dept();
	}

}
