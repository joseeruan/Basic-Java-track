package edu.jose.bank.bankwithPOO;

public class SavingAccount extends Account{

    public SavingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("Savings account balance");
        super.printStatement();
    }
}
