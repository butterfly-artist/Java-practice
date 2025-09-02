package demo;
import java.util.Scanner;
public class billdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the old current bill: ");
		int oldmeter=scan.nextInt();
		System.out.println("Enter the new current bill: ");
		int newmeter=scan.nextInt();
		int units=newmeter-oldmeter;
		int bill=0;
		if(units<=50) {
			bill=units*1;
		}
		else if(units<=100) {
			bill=(50*1)+(units-50)*2;
		}
		else if(units<=200) {
			bill=(50*1)+(units-50)*2+(units-100)*3;
		}
		else if (units<=400) {
			bill=(50*1)+(units-50)*2+(units-100)*3+(units-200)*4;
		}
		else {
			bill=(50*1)+(units-50)*2+(units-100)*3+(units-200)*4+(units-400)*5;
		}
		System.out.println("Units"+units);
		System.out.println("bill"+bill);
		scan.close();
	}

}
