/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import java.util.LinkedList;

/**
 *
 * @author Gloria Ezzat
 */
public class ATM {
    private int balance;
    private String location;
    private LinkedList<Transaction> newTransaction=new LinkedList<Transaction>();
    private LinkedList<String> transactions;
    private int code;
    
    public ATM(int balance, String location) {
        this.balance = balance;
        this.location = location;
        this.code=10000;
        this.newTransaction.add(new Transaction(code));
        this.transactions=this.newTransaction.get(0).getTransactions();
    }

    @Override
    public String toString() {
        return "ATM{" + "balance=" + balance + ", location=" + location + '}';
    }
    public void addNewTransaction(){
        this.code+=1;
        this.newTransaction.add(new Transaction(code));
    }

    public LinkedList<String> getTransactions() {
        return transactions;
    }
    public boolean withdrawCash(int amount,Account account){
        for(int i=0;i<newTransaction.size();i++){
            if(this.getcode()==this.newTransaction.get(i).getCode())
            {
                this.newTransaction.get(i).withdraw(amount,account,this);
                return true;
            }
        }
        return false;
    }
    public boolean depositFunds(double amount,Account account){
        for(int i=0;i<newTransaction.size();i++){
            if(this.getcode()==this.newTransaction.get(i).getCode())
            {
                this.newTransaction.get(i).deposit(amount,account);
                return true;
            }
        }
        return false;
    }
    public double checkBalance(Account account){
        for(int i=0;i<newTransaction.size();i++){
            if(this.getcode()==this.newTransaction.get(i).getCode())
            {
                double balance=this.newTransaction.get(i).checkBalance(account);
                return balance;
            }
        }
        return 0;
    }
    public String printReceipt(Client client){
        for(int i=0;i<newTransaction.size();i++){
            if(this.getcode()==this.newTransaction.get(i).getCode())
            {
                return this.newTransaction.get(i).printReceipt(client);
            }
        }
        return null;
    }
    public void exit(){
        for(int i=0;i<newTransaction.size();i++){
            if(this.getcode()==this.newTransaction.get(i).getCode())
            {
                this.newTransaction.get(i).exit();
            }
        }
    }
    public boolean checkValidAmount(int cash){
        return cash <= balance;
    }
    
    public boolean modifyBalance(int cash){
        if(cash/20==0){
            this.setBalance(balance-cash);
            return true;
        }
        else
            return false;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBalance() {
        return balance;
    }

    public String getLocation() {
        return location;
    }

    private int getcode() {
        return code;
    }

}
