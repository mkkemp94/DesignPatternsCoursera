package com.example.designpatternscoursera.facade.model;

import android.util.Log;

import java.math.BigDecimal;

public class Saving implements IAccount {

    public static final String TAG = "SavingAccount";

    public Saving(final BigDecimal initAmount) {

    }

    @Override
    public void deposit(final BigDecimal amount) {
        Log.i(TAG, "deposit " + amount);
    }

    @Override
    public void withdraw(final BigDecimal amount) {
        Log.i(TAG, "withdraw " + amount);
    }

    @Override
    public void transfer(final IAccount toAccount, final BigDecimal amount) {
        Log.i(TAG, "transfer " + amount + " to " + toAccount.getAccountNumber());
    }

    @Override
    public int getAccountNumber() {
        Log.i(TAG, "getAccountNumber");
        return 0;
    }
}
