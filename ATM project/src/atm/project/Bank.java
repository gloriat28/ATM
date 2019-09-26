package atm.project;
import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gloria Ezzat
 */
public class Bank {
    private String name;
    private ArrayList<Client> clients=new ArrayList<>();
    private ArrayList<bankEmployee> employees=new ArrayList<>();
    public Bank() throws Exception{
        this.name="HSBC";
        this.clients.add(new Client(12334345,"Gloria","01270979169","El Daher",897789796,20000,89797984,25728));
        this.clients.add(new Client(76744543,"Lorina","01245466879","El Rehab",687678668,10980,25636565,87896));
        this.clients.add(new Client(32586789,"Engy","01267858587","El Shorouk",253522543,78760,47879865,34567));
        this.clients.add(new Client(24565889,"Anas","01287896787","Sheraton",934728734,39000,65764573,34598));
        this.employees.add(new bankEmployee(2378379,"Kareem",2500));
        this.employees.add(new bankEmployee(7657966,"Wafaa",7000));
        FileOutputStream fo = new FileOutputStream("Clients.txt"); 
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(clients);
        out.close();
        fo.close();
        FileOutputStream fo1 = new FileOutputStream("Employees.txt"); 
        ObjectOutputStream out1 = new ObjectOutputStream(fo1);
        out1.writeObject(employees);
        out1.close();
        fo1.close();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public void addEmployee(bankEmployee employee){
        employees.add(employee);
    }
    public Client checkClient(int num,int pin) throws Exception{
        ArrayList<Client> clients;
        try (FileInputStream si = new FileInputStream("Clients.txt"); 
        ObjectInputStream in = new ObjectInputStream(si)) {
            clients=(ArrayList<Client>) in.readObject();
        }
        for(int i=0;i<clients.size();i++){
            if(clients.get(i).getAccount().getCard().verifyNumber(num) && clients.get(i).getAccount().getCard().verifyPin(pin))
                return clients.get(i);
        }
        return null;
    }
}
