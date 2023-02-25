/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_shuvalovmd.practical_1_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the duration (in months): ");
        int month = scan.nextInt();
        System.out.println("Enter the annual percent: ");
        float percent = scan.nextFloat();
        System.out.println("Enter the starting amount: ");
        float amount = scan.nextFloat();
        for (int i=0;i<=month;i=i+12){
            amount = amount * (1+percent/100);
        }
        System.out.println("Amount will be: "+amount);
    }       
}
