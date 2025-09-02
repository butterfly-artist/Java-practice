package demo;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num 1 ");
		int num1=scan.nextInt();
		System.out.println("Enter num 2 ");
		int num2=scan.nextInt();
		int choice;
		do {
			System.out.println("Choice from 1-7 ");
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Addition: "+(num1+num2));
				break;
			case 2:
				System.out.println("Substraction: "+(num1-num2));
				break;
			case 3:
				System.out.println("mltiplication: "+(num1*num2));
				break;
			case 4:
				System.out.println("Division: "+(num1/num2));
				break;
			case 5:
				System.out.println("remainder: "+(num1%num2));
				break;
			case 6:
				System.out.println("power: "+Math.pow(num1,num2));
				break;
			case 7:
				System.out.println("QUIT");
				break;
			default:
				System.out.println("invalid");
				break;
			}
		}while(choice!=7);
		scan.close();
	}

}
