/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_shuvalovmd.practical_1_6;

/**
 *
 * @author Vedro
 */
public class Cellphone extends Telephone{
    private String owner;

    public Cellphone(String owner, String number, String manufacturer) {
        super(number, manufacturer);
        this.owner = owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    @Override
    public String getInfo() {
        return getNumber() + ',' + getManufacturer() + ',' + getOwner();
    }
}
