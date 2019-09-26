package atm.project;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Engy
 */
public class Account implements Serializable
{
    private double balance;
    private int accountNumber;
    private DebitCard card;
    
    public Account( int accountNumber,double balance,int cardNum,int pin) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        card=new DebitCard(cardNum,pin);
    }

    @Override
    public String toString() {
        return "Balance " + balance + "\nAccount Number " + accountNumber +"\n"+ card ;
    }

    public void setCard(DebitCard card) {
        this.card = card;
    }

    public DebitCard getCard() {
        return card;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
    
   
}
