/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_shuvalovmd.practical_1_6;

/**
 *
 * @author Vedro
 */
public class Smartphone extends Cellphone{
    private String cpu;
    private int ram;

    public Smartphone(String cpu, int ram, String owner, String number, 
        String manufacturer) {
        super(owner, number, manufacturer);
        this.cpu = cpu;
        this.ram = ram;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    
    public String getCpu(){
        return this.cpu;
    }
    public int getRam(){
        return this.ram;
    }
    
    @Override
    public String getInfo() {
        return getNumber() + ',' + getManufacturer() + ',' + getOwner() 
            + ',' + getCpu() + ',' +  getRam();
    }
}
