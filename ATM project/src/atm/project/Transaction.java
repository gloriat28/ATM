/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import java.util.LinkedList;

/**
 *
 * @author Engy
 */

public class Transaction
        
{
    private int code;
    private static int counter=0;
    private LinkedList<String> transactions=new LinkedList<String>();

    public Transaction(int code) {
        this.code = code;
        this.transactions.add("1-Withdraw Cash");
        this.transactions.add("2-Deposit Funds");
        this.transactions.add("3-Check Balance");
        this.transactions.add("4-Print Receipt");
        this.transactions.add("5-Exit");
        Transaction.counter+=1;
    }
    public static int getTransactionsNumber(){
        return counter;
    }

    public int getCode() {
        return code;
    }

    public LinkedList<String> getTransactions() {
        return transactions;
    }
   
    public double checkBalance (Account account)
    {
        return account.getBalance();
    }
    
    public boolean withdraw(int cash,Account account,ATM atm)
    { 
        if(cash>account.getBalance())
            return false;
        else
        {
            if(atm.checkValidAmount(cash)){
                account.setBalance(account.getBalance()-cash);
                atm.modifyBalance(cash);
                return true;
            }
            else return false;
        }
    }
    public void deposit(double funds,Account account)
    {
        funds/=100;
        account.setBalance(account.getBalance()+funds);
    }
    
    public String printReceipt(Client client)
    {
        return "Transaction "+ code+"\n"+client;
    }
   
    public void exit ()
    {
        System.exit(0);
    }
}
