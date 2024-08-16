package edu.jose.bank;


import java.util.Scanner;

public class Account {
    private String clientName;
    private String agency;
    private int agencyNumber;
    private float balance;


    public Account(String clientName, String agency, int agencyNumber, float balance) {
        this.clientName = clientName;
        this.agency = agency;
        this.agencyNumber = agencyNumber;
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Hello " + getClientName() + ", thank you for opening an account with our bank. Your agency is "
                + getAgency() + ", account number "
                + getAgencyNumber() + ", and your balance of " + getBalance() + " is now available for withdrawal.\n";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        String agency;
        int number;
        float balance;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your agency:");
        agency = scanner.nextLine();

        System.out.println("Enter agency number:");
        number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your bank balance:");
        balance = scanner.nextFloat();


        scanner.close();

        Account account = new Account(name, agency, number, balance);
        System.out.println(account.toString());


    }
}
