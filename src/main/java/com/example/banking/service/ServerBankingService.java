package com.example.banking.service;

import com.example.banking.transaction.IBanking;
import org.springframework.stereotype.Service;

@Service
public class ServerBankingService implements IBanking {

    public ServerBankingService() {
        System.out.println("=== bank is created ===");
    }

    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        balance = balance - money;
        return balance;
    }
}

