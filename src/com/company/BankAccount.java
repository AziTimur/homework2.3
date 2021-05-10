package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("На вашем счету:" + amount);
    }

    public void withDraw(int sum) throws LimitException {

        if (sum  > amount) {
            throw new LimitException("Не достаточно средств для снятие денег", amount);
        } else {
            amount = amount - sum;
            System.out.println("На вашем счету:" + amount);

        }


    }
}
