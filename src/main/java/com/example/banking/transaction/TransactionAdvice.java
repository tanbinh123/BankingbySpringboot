package com.example.banking.transaction;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAdvice {

    @Before("execution(* com.example.banking.transaction.IBanking.*(..))")
    public void before() {
        System.out.println("=== database connect===");
    }

    @After("execution(* com.example.banking.transaction.IBanking.*(..))")
    public void after() {
        System.out.println("=== database close ===");
    }
}

