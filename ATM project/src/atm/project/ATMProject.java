/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;
import java.util.Scanner;


/**
 *
 * @author Engy
 */
public class ATMProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        Bank bank=new Bank();
        ATM atm=new ATM(10000,"Nasr City");
        Client client=null;
        System.out.println("Enter card number");
        int number=input.nextInt();
        System.out.println("Enter pin");
        int pin=input.nextInt();
        if(bank.checkClient(number,pin)==null){
            System.out.println("Invalid Card Number or Pin");
            atm.exit();
        }
        else
            client=bank.checkClient(number,pin);
        int choix;
        int cash;
        String space;
        do{
            atm.addNewTransaction();
            System.out.println(atm.getTransactions());
            System.out.println("Kindly enter your choice");
            choix=input.nextInt();
            switch(choix){
                case 1:
                    System.out.println("You chose withdraw transaction : please enter the amount of money : " + "");
                    cash = input.nextInt();
                    if(atm.withdrawCash(cash, client.getAccount()))
                        System.out.println("Transaction successful");
                    break;
                case 2:
                    System.out.println("You chose deposit transaction : please enter the amount of money : " + "");
                    cash = input.nextInt();
                    if(atm.depositFunds(cash, client.getAccount()))
                        System.out.println("Transaction successful");
                    break;
                case 3:
                    System.out.println("Your balance is "+atm.checkBalance(client.getAccount()));
                    break;
                case 4:
                    System.out.println(atm.printReceipt(client));
                    break;
                case 5:
                    atm.exit();
                    break;
                    
            }
            System.out.println("Press enter to continue");
            space=input.nextLine();space=input.nextLine();
            }while(choix!=5);
    
        
    }
}
    

