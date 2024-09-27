package edu.jose.bank.bankwithPOO;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("Current account balance: ");
        super.printStatement();
    }
}
