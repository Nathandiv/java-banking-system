import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float balance = 5000.0f;

        System.out.println("WELCOME TO GL Banking Services");
        System.out.println("Which service would you like to do?");
        System.out.println("1. Deposit");
        System.out.println("2. Check balance");
        System.out.println("3. Transfer");
        System.out.println("4. withdraw");

        System.out.print("Enter 1, 2,3 or 4: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("HOW MUCH DO YOU WANT TO DEPOSIT? ");
                float depositAmount = input.nextFloat();
                if (depositAmount >= 5) {
                    balance += depositAmount;
                    System.out.println("Money was deposited successfully.");
                    System.out.println("Your new balance is: R" + balance);
                } else {
                    System.out.println("Money was not deposited. Minimum amount to deposit is R5.");
                }
                break;

            case 2:
                System.out.println("Your current balance is: R" + balance);
                System.out.println("1. Deposit");
                System.out.println("2. withdraw");
                System.out.print("Enter 1, 2: ");
                int checkBalanceChoice = input.nextInt();
                if (checkBalanceChoice == 1) {
                    System.out.print("HOW MUCH DO YOU WANT TO DEPOSIT? ");
                    float depositAmount2 = input.nextFloat();
                    if (depositAmount2 >= 5) {
                        balance += depositAmount2;
                        System.out.println("Money was deposited successfully.");
                        System.out.println("Your new balance is: R" + balance);
                    } else {
                        System.out.println("Money was not deposited. Minimum amount to deposit is R5.");
                    }
                } else if (checkBalanceChoice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmount = input.nextFloat();
                    if (withdrawAmount < 5) {
                        System.out.println("Minimum withdrawal amount is R5.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Money was withdrawn successfully.");
                        System.out.println("Your new balance is: R" + balance);
                    }
                }
                

                break;

            case 3:
                String[] peopleName = {"nathan", "life", "gugu"};
                System.out.println("Your current balance is: R" + balance);

                System.out.print("Enter amount to transfer: ");
                float transferAmount = input.nextFloat();

                System.out.print("Enter name of the person you want to transfer to: ");
                String personName = input.next();

                boolean personExists = false;
                for (String name : peopleName) {
                    if (name.equalsIgnoreCase(personName)) {
                        personExists = true;
                        break;
                    }
                }

                if (!personExists) {
                    System.out.println("Person does not exist: " + personName);
                } else if (transferAmount < 5) {
                    System.out.println("Minimum transfer amount is R5.");
                } else if (transferAmount > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    balance -= transferAmount;
                    System.out.println("Money was transferred successfully to " + personName);
                    System.out.println("Your new balance is: R" + balance);
                }
                break;

            case 4:
                System.out.print("Enter amount to withdraw: ");
                float withdrawAmount = input.nextFloat();

                if (withdrawAmount < 5) {
                    System.out.println("Minimum withdrawal amount is R5.");
                } else if (withdrawAmount > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Money was withdrawn successfully.");
                    System.out.println("Your new balance is: R" + balance);
                }
                break;

            default:
                System.out.println("Invalid option. Please enter 1, 2,4 or 4.");
        }

       
        input.close(); 
       
    }
}
