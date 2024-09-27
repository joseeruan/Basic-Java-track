package edu.jose.bank.bankwithPOO;

import edu.jose.bank.bankwithPOO.interfaces.IAccount;

public abstract class Account implements IAccount {
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;
    
    public Account(Client client) {
        this.client = client;
        this.agency = Account.DEFAULT_AGENCY;
        this.number = Account.SEQUENTIAL++;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void draw(double value) {
        this.balance -= value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.balance -= value;
        destinationAccount.deposit(value);
    }


    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void printStatement() {
        System.out.println("Titular " + this.client.getName());
        System.out.println("Agency: " + this.agency);
        System.out.println("Number: " + this.number);
        System.out.println("Balance: " + this.balance);
    }
}
