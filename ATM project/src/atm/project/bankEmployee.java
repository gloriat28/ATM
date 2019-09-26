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
public class bankEmployee implements Serializable{
    private int ID;
    private String name;
    private double salary;

    public bankEmployee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", salary=" + salary + '}';
    }
    
    public void refill(ATM atm,int newBalance){
        if(atm.getBalance()!=10000)
            atm.setBalance(10000);
    }
    
    public void startup(ATM atm,int newBalance){
        atm.setBalance(newBalance);
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
