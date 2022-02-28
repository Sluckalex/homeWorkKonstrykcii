package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int month = sc.nextInt();
        String monthString;
        switch (month) {
            case 1:
                monthString = "Зима";
                break;
            case 2:
                monthString = "Зима";
                break;
            case 3:
                monthString = "Весна";
                break;
            case 4:
                monthString = "Весна";
                break;
            case 5:
                monthString = "Весна";
                break;
            case 6:
                monthString = "Лето";
                break;
            case 7:
                monthString = "Лето";
                break;
            case 8:
                monthString = "Лето";
                break;
            case 9:
                monthString = "Лето";
                break;
            case 10:
                monthString = "Осень";
                break;
            case 11:
                monthString = "Осень";
                break;
            case 12:
                monthString = "Зима";
                break;
            default:
                monthString = "Ошибка";
                break;
        }
        System.out.print(monthString);
    }
}

