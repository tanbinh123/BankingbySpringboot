package com.example.banking.transaction;

public interface IBanking {
    Integer deposit(Integer money) throws Exception;
    Integer withdraw(Integer money) throws Exception;
}