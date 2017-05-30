package org.citi.bankapptdd.service.BankingApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.citi.bankapptdd.dto.BankingApplication.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements AccountService {
	
	
	Account account = new Account();

	@Override
	public Account getUserAccount(String accountNum, Long customerId) {
		try {
            BufferedReader in = new BufferedReader(new FileReader("../Desktop/BankDetails"));
            String str;
            str = in.readLine();
            while ((str = in.readLine()) != null) {
            	String[] ar=str.split(",");
            	if(ar[3]==accountNum && ar[1]==customerId.toString()){
            		account.setCustomerId(Long.parseLong(ar[1]));
            		account.setAccountNumber(ar[3]);
            		account.setBalance(Double.parseDouble(ar[2]));
            		account.setAccountName(ar[0]);
            	}
            }
            in.close();
        }
		catch (IOException e) {
            System.out.println("File Read Error");
        }
		return account;
		
	}

	@Override
	public void createAccount(Long customerId, String accountName , String accountNumber, Double balance) {
		final String delimiter = ",";

		FileWriter fw = null;
		BufferedWriter bw = null;
		Account account1 = new Account(accountName, customerId, balance, accountNumber);
		try{
			fw = new FileWriter("../Desktop/BankDetails");
			fw.append(String.valueOf(account1.getAccountName()));
			fw.append(delimiter);
			fw.append(String.valueOf(account1.getCustomerId()));
			fw.append(delimiter);
			fw.append(String.valueOf(account1.getBalance()));
			fw.append(delimiter);
			fw.append(String.valueOf(account1.getAccountNumber()));
		}
		catch(IOException e){
			System.out.println("File write error");
		}
		finally{
			try{
				fw.close();
		}
			catch(IOException e){
				System.out.println("Error while closing");
			}
		}
		
		
	}

	@Override
	public boolean transfer(Long customerId, String accountNum, int amountTransfer, String recepientAccontNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
