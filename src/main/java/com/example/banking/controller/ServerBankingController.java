package com.example.banking.controller;

import com.example.banking.service.ServerBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@EnableAspectJAutoProxy
public class ServerBankingController {

    @Autowired
    ServerBankingService serverBankingService;

    @RequestMapping(method = RequestMethod.GET, path="/deposit/{money}")
    public String balance(@PathVariable("money") Integer money) {
        System.out.println("방금 입력한 값은 " + money + "입니다");
        int currentMoney = serverBankingService.deposit(money);
        System.out.println("지금까지 도합 "+ currentMoney + "원을 저금하였습니다" );
        return "balance is"  + currentMoney;
    }

    @RequestMapping(method = RequestMethod.GET, path="/balances/{account}")
    public String balance(@PathVariable("account") String account) {
        return "balance for account " + account;
    }
}
