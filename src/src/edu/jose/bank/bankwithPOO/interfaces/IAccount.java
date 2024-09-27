package edu.jose.bank.bankwithPOO.interfaces;

public interface IAccount {
    void deposit(double value);
    void draw(double value);
    void transfer(double value, IAccount destinationAccount);
    void printStatement();
}
