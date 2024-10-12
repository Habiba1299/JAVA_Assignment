import java.util.Scanner;

public class BankAccount {


    private String name;
    private int account_no;
    private double balance;

    Scanner sc = new Scanner(System.in);

    BankAccount(){
        name =name;
        account_no = 0;
        balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName() {

        System.out.print("Name: ");
        String name = sc.nextLine();
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

   public void setBalance() {

        System.out.print("Balance: ");
        int balance = sc.nextInt();
        this.balance = balance;
    }

    public void  depositMoney()
    {
        System.out.print("Enter amount: ");
        int deposit = sc.nextInt();
        balance = balance + deposit;
        this.balance = balance;
    }

    public void  withDrawMoney()
    {
        System.out.print("Enter amount: ");
        int withdraw = sc.nextInt();
        balance = balance - withdraw;
        this.balance = balance;
    }


    void checkBalance(){

        System.out.println("Account number : "+account_no);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }


    public static void main(String[] args) {

        int s,no,i =0,m;
        Scanner sc = new Scanner(System.in);

        System.out.println("how many account you want to create:");
        m = sc.nextInt();
        BankAccount [] account = new BankAccount[m];

        do {

            System.out.print("------\n1 .open account \n2 . diposit money\n3 to withdraw money\n4 .check balannce\n 0 to exit\n------\nEnter your choice: ");

            s = sc.nextInt();
            switch (s) {
                case 1:
                        account[i] = new BankAccount();
                        account[i].account_no = i+1;
                        account[i].setName();
                        account[i].setBalance();
                        i++;
                    break;

                case 2:
                    System.out.println("Enter the account number: ");
                    no = sc.nextInt();
                    account[no-1].depositMoney();

                    break;

                case 3:
                    System.out.println("Enter the account number: ");
                    no = sc.nextInt();
                    account[no-1].withDrawMoney();
                    break;

                case 4:
                    System.out.println("Enter the account number: ");
                    no = sc.nextInt();
                    account[no-1].checkBalance();
                    break;

                default:
                    System.out.println("wrong input");
                    break;
            }

        }while(s != 0);

    }
}
