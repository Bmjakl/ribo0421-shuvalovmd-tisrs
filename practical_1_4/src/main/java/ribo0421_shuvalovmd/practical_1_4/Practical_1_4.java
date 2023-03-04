/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_shuvalovmd.practical_1_4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_4 {

    public static void main(String[] args) {
        System.out.println("Практическое занятие 1.4");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String number = scan.nextLine();
        System.out.println("Введите имя: ");
        String owner  = scan.nextLine();
        System.out.println("Введите модель: ");
        String model  = scan.nextLine();
        System.out.println("Это смартфон? (true/false): ");
        boolean smartphone  = scan.nextBoolean();
        if (smartphone) {
            System.out.println("Какой процесор?: ");
            String cpu = scan.nextLine();
            System.out.println("Сколько памяти?: ");
            int ram  = scan.nextInt();
            Smartphone smart = new Smartphone(cpu, ram, number, owner, model);
            System.out.println(smart.getInfo());
        }
        else {
            Telephone tele = new Telephone(number, owner, model);
            System.out.println(tele.getInfo());
        }
    }
}
