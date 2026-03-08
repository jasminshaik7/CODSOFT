class BankAccount {
    double balance = 1000;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void checkBalance(){
        System.out.println("Balance: " + balance);
    }
    
}