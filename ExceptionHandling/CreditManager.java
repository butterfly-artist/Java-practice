package demo;

	public class CreditManager {
	    public void enrollCourse(int credits) throws CreditsNotSufficientException {
	        if (credits<50) {
	            throw new CreditsNotSufficientException("Not enough credits to enroll in course.");
	        }
	        System.out.println("Course enrolled successfully.");
	    }
	    public void accessLibrary(int credits) throws CreditsNotSufficientException {
	        if (credits<50) {
	            throw new CreditsNotSufficientException("Not enough credits to access library.");
	        }
	        System.out.println("Library access granted.");
	    }

	    public void participateEvent(int credits) throws CreditsNotSufficientException {
	        if (credits<50) {
	            throw new CreditsNotSufficientException("Not enough credits to participate in event.");
	        }
	        System.out.println("Event participation confirmed.");
	    }
	
public static void main(String[]args) {
	CreditManager CM=new CreditManager();
	int[] textcredits= {10,30,61};
	for(int credits:textcredits) {
		try {
			CM.accessLibrary(credits);
		}catch(CreditsNotSufficientException e) {
			System.out.println("Library access error"+e.getMessage());
		}try {
			CM.enrollCourse(credits);
		}catch(CreditsNotSufficientException e) {
			System.out.println("enroll course error"+e.getMessage());
		}try {
			CM.participateEvent(credits);
		}catch(CreditsNotSufficientException e) {
			System.out.println("participate event access error"+e.getMessage());
		}
	}
//	CM.enrollCourse(258);
//	CM.accessLibrary(28);
//	CM.participateEvent(49);
}
	}
