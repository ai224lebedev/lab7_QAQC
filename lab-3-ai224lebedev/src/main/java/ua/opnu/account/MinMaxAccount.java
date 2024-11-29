package ua.opnu.account;

import ua.opnu.java.inheritance.account.BankingAccount;
import ua.opnu.java.inheritance.account.Credit;
import ua.opnu.java.inheritance.account.Debit;
import ua.opnu.java.inheritance.account.Startup;

public class MinMaxAccount extends BankingAccount {
    private int min;
    private int max;

    public MinMaxAccount(Startup s) {
        super(s);
        this.min = getBalance();
        this.max = getBalance();
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    @Override
    public void debit(Debit d) {
        super.debit(d);
        setMinMaxBalance();
    }

    @Override
    public void credit(Credit c) {
        super.credit(c);
        setMinMaxBalance();
    }

    private void setMinMaxBalance() {
        this.max = Math.max(getBalance(), this.max);
        this.min = Math.min(getBalance(), this.min);
    }
}
