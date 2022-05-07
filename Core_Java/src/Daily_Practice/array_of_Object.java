package Daily_Practice;
//1-D single dimenssion
class student1
{
	public int roll_no;
	public String name;

	student1(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class array_of_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1[] arr;
		arr = new student1[5];
		arr[0]=new student1(1,"archana");
		arr[1]=new student1(2,"prisha");
		arr[2]=new student1(3,"ayush");
		arr[3]=new student1(4,"smita");
		arr[4]=new student1(5,"mau");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at " + i +" : " +arr[i].roll_no+" "+arr[i].name);
		}
	}

}
