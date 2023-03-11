/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_shuvalovmd.practical_1_6;

/**
 *
 * @author Vedro
 */
public class Seller {

    public Seller() {
    }
    
    
    public void modify(Telephone tele) {
        String manufacturer = tele.getManufacturer();
        String str = "";
        for (int i = 0; i < manufacturer.length(); i++) {
            if (Character.toLowerCase(manufacturer.charAt(i))=='o'){
                str += 'a';  
            }
            else{
                if ((i==0)&(manufacturer.charAt(i)=='N')|(manufacturer.charAt(i)=='n')) {
                    str += manufacturer.charAt(i);
                }
                else{
                    str += Character.toLowerCase(manufacturer.charAt(i));                    
                }
            }     
        }
        tele.setManufacturer(str);
    } 
}
