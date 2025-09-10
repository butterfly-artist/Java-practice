package demo;
import java.util.Scanner;

public class bankstatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Arrays to store customer data
        String[] names = new String[10];
        int[] aadhar = new int[10];
        int[] pan = new int[10];
        int[] account = new int[10];
        int[] balance = new int[10];
        int customerCount = 0;

        int choice;
        boolean continueApp = true;

        while (continueApp) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Transfer Money");
            System.out.println("6. Continue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    if (customerCount < 10) {
                        scan.nextLine(); // consume newline
                        System.out.print("Enter name: ");
                        names[customerCount] = scan.nextLine();
                        System.out.print("Enter Aadhar number: ");
                        aadhar[customerCount] = scan.nextInt();
                        System.out.print("Enter PAN number: ");
                        pan[customerCount] = scan.nextInt();
                        System.out.print("Enter Account number: ");
                        account[customerCount] = scan.nextInt();
                        balance[customerCount] = 0;
                        System.out.println(" Account created successfully!");
                        customerCount++;
                    } else {
                        System.out.println(" Maximum customer limit reached.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number to credit: ");
                    int accCredit = scan.nextInt();
                    System.out.print("Enter amount to credit: ");
                    int creditAmount = scan.nextInt();
                    boolean credited = false;
                    for (int i = 0; i < customerCount; i++) {
                        if (account[i] == accCredit) {
                            balance[i] += creditAmount;
                            System.out.println("Amount credited successfully.");
                            credited = true;
                            break;
                        }
                    }
                    if (!credited) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number to debit: ");
                    int accDebit = scan.nextInt();
                    System.out.print("Enter amount to debit: ");
                    int debitAmount = scan.nextInt();
                    boolean debited = false;
                    for (int i = 0; i < customerCount; i++) {
                        if (account[i] == accDebit) {
                            if (balance[i] >= debitAmount) {
                                balance[i] -= debitAmount;
                                System.out.println("Amount debited successfully.");
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            debited = true;
                            break;
                        }
                    }
                    if (!debited) {
                        System.out.println(" Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number for balance enquiry: ");
                    int accEnquiry = scan.nextInt();
                    boolean found = false;
                    for (int i = 0; i < customerCount; i++) {
                        if (account[i] == accEnquiry) {
                            System.out.println(" Account Holder: " + names[i]);
                            System.out.println(" Balance: " + balance[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter FROM account number: ");
                    int fromAcc = scan.nextInt();
                    System.out.print("Enter TO account number: ");
                    int toAcc = scan.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    int transferAmount = scan.nextInt();

                    int fromIndex = -1, toIndex = -1;
                    for (int i = 0; i < customerCount; i++) {
                        if (account[i] == fromAcc) fromIndex = i;
                        if (account[i] == toAcc) toIndex = i;
                    }

                    if (fromIndex != -1 && toIndex != -1) {
                        if (balance[fromIndex] >= transferAmount) {
                            balance[fromIndex] -= transferAmount;
                            balance[toIndex] += transferAmount;
                            System.out.println(" Transfer successful.");
                        } else {
                            System.out.println(" Insufficient balance in FROM account.");
                        }
                    } else {
                        System.out.println(" One or both accounts not found.");
                    }
                    break;

                case 6:
                    System.out.print("Do you want to continue? (yes/no): ");
                    String response = scan.next().toLowerCase();
                    if (response.equals("no")) {
                        continueApp = false;
                        System.out.println("Exiting the application.");
                    }
                    break;

                case 7:
                    continueApp = false;
                    System.out.println(" Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scan.close();
    }
}
