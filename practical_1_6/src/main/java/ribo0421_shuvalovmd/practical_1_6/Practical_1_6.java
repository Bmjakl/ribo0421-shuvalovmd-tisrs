/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_shuvalovmd.practical_1_6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_6 {

    public static void main(String[] args) {
        System.out.println("Практическое занятие 1.6");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String number = scan.nextLine();
        System.out.println("Введите производителя: ");
        String manufacturer  = scan.nextLine();
        System.out.println("Это сотовый? (true/false): ");
        boolean cellphone = scan.nextBoolean();
        if (cellphone) {
            System.out.println("Введите владельца: ");
            String owner = scan.nextLine();
            System.out.println("Это смартфон? (true/false): ");
            boolean smartphone  = scan.nextBoolean();
            if (smartphone) {
                System.out.println("Какой процесор?: ");
                String cpu = scan.nextLine();
                System.out.println("Сколько памяти?: ");
                int ram  = scan.nextInt();
                Smartphone smart = new Smartphone(cpu, ram, owner, number, 
                    manufacturer);
                System.out.println(smart.getInfo());
            }
            else {
                Cellphone cell = new Cellphone(owner, number, manufacturer);
                System.out.println(cell.getInfo());
                cell.modify();
                System.out.println(cell.getInfo());
            }
        }
        else {
            Telephone tele = new Telephone(number, manufacturer);
            System.out.println(tele.getInfo());
            tele.modify();
            System.out.println(tele.getInfo());
        }
    }
}
