package demo;

public class sumofevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				evensum=evensum+i;
			}else {
				oddsum=oddsum+i;
			}
		}
		System.out.println("Even sum: "+evensum);
		System.out.println("Odd sum: "+oddsum);
	}

}
