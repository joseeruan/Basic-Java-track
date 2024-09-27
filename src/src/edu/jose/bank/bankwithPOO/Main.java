package edu.jose.bank.bankwithPOO;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("José", "7121212");
        Account account1 = new SavingAccount(client1);


        Client client2 = new Client("Pedro", "7123232");
        Account account2 = new CheckingAccount(client2);

        account1.deposit(100);
        account1.transfer(50, account2);
        account1.printStatement();
        account2.printStatement();

    }
}
