/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_shuvalovmd.practical_1_6;

/**
 *
 * @author Vedro
 */
public class Telephone{
    private String number;
    private String manufacturer;

    public Telephone(String number, String manufacturer) {
        this.number = number;
        this.manufacturer = manufacturer;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNumber() {
        return this.number;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getInfo() {
        return getNumber() + ',' + getManufacturer();
    }
}

