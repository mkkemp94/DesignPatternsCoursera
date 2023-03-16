package com.example.designpatternscoursera.facade;

import android.util.Log;

import com.example.designpatternscoursera.facade.model.Checking;
import com.example.designpatternscoursera.facade.model.IAccount;
import com.example.designpatternscoursera.facade.model.Investment;
import com.example.designpatternscoursera.facade.model.Saving;

import java.math.BigDecimal;
import java.util.HashMap;

public class BankService {
    private HashMap<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new HashMap<>();
    }

    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;

        switch (type) {
            case "checking":
                newAccount = new Checking(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                Log.e("BankService", "Invalid account type");
                break;
        }

        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }
}
