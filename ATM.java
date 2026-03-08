import java.util.*;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        int choice;
        do {
            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    acc.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
            }
        } while(choice != 4);
        sc.close();
    }
    
}