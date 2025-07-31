import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Initial Balance: ");
        Double balance = sc.nextDouble();
        sc.nextLine(); //Advances the program


        BankAccount b1 = new BankAccount(name, balance);

        System.out.println("Would you like to deposit? (Y/N)");

        String choice = sc.nextLine().toLowerCase();

        if (choice.equals("y")) {
            System.out.println("How much would you like to deposit?");
            double amount = sc.nextDouble();
            b1.deposit(amount);
        }

        else if (choice.equals("n")) {
            System.out.println("How much would you like to withdraw?");
            double amount = sc.nextDouble();
            b1.withdraw(amount);
        }

        else {
            System.out.println("Invalid Choice");
            return;
        }

        System.out.print("Account Information: " + b1);

    }
}
