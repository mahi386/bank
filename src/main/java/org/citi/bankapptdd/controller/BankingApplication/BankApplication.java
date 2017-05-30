package org.citi.bankapptdd.controller.BankingApplication;

import org.citi.bankapptdd.dto.BankingApplication.Account;
import org.citi.bankapptdd.service.BankingApplication.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class BankApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(BankApplication.class, args);
    }
}
