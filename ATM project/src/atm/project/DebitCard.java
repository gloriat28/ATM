/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import java.io.Serializable;

/**
 *
 * @author Engy
 */
public class DebitCard implements Serializable
{
    private int cardNumber;
    private int pin;
    
    public DebitCard(int cardNumber, int pin)
    {
         this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Card Number " + cardNumber ;
    }
    public boolean verifyPin(int pin){
        return this.pin==pin;
    }
    public boolean verifyNumber(int num){
        return this.cardNumber==num;
    }
    public void changePin (int newPin)
    {
        this.setPin(newPin);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
}
