package Daily_Practice;

import java.util.Scanner;

/*java program to calculate the commission as follows: 
 * Sales_amount >= 100000,commission = 10%; 
 * 50000 <= Sales_amount < 100000, commission = 5%; 
 * 30000 <= Sales_amount < 50000, commission = 3%;
 * Sales_amount < 30000, no commission.*/
public class commision 
{
    String name ,add;
    int ph;
    int sale;
    double comm;
    
    void Empdet() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee name: "+name);
        @SuppressWarnings("unused")
		String  name = in.next();
        System.out.print("Enter employee phone: "+ph);
         ph= in.nextInt();
        System.out.print("Enter employee address: "+add);
        add = in.next();
        System.out.print("Enter monthly sales value: "+sale);
        sale = in.nextInt();
        in.close();
    }
    
    void compute() {
        if (sale >= 100000) {
            comm = 12*sale/100;
        }
        else if (sale < 100000) {
            comm = 5* sale/100;
        }
        else if (sale < 50000) {
            comm = 3*sale/100;
        }
        else if (sale < 30000) {
            comm = 0*sale/100;
            System.out.println("no commission"+comm);
        }
    }
    
    void display() {
       
		System.out.println("Employee name: " +name);
        System.out.println("Employee phone: " +ph);
        System.out.println("Employee Adress: "+add);
        System.out.println(" Sales amount: " +sale);
        System.out.println("Commission: " + comm);
    }
    
    public static void main( ) {
    	commision obj = new commision();
        obj.Empdet();
        obj.compute();
        obj.display();
    }
}