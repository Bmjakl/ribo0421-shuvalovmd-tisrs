/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_shuvalovmd.practical_1_4;

/**
 *
 * @author user
 */
public class Telephone {
    private String number;
    private String owner;
    private String model;

    public Telephone(String number, String owner, String model) {
        this.number = number;
        this.owner = owner;
        this.model = model;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    
    public String getNumber(){
        return this.number;
    }
    public String getModel(){
        return this.model;
    }
    public String getOwner(){
        return this.owner;
    }
    
    public String getInfo() {
        return getNumber() + ',' + getModel() + ',' +  getOwner();
    }
}
