/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import java.io.Serializable;

/**
 *
 * @author Gloria Ezzat
 */
public class Client implements Serializable{
    private int ID;
    private String name;
    private String phone;
    private String address;
    private Account account;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public Client(int id,String name, String phone, String address,int accNum,double balance,int cardNum,int pin) {
        this.ID=id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.account=new Account(accNum,balance,cardNum,pin);
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Client ID "+ID+ "\nName " + name + "\nPhone " + phone + "\nAddress " + address +"\n"+ account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
}
