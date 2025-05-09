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
        System.out.print("Enter 1, 2, or 3: ");
        int choice = input.nextInt();

       
        input.close(); 
       
    }
}
