package ru.spypro.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //exerciseOne();
       //exerciseTwo();
        exerciseThree();
        //exerciseFour();
        //exerciseFive();

    }

    public static void exerciseOne() {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void exerciseTwo() {
        int clientOS = 1;
        int clientDeviceYear = 2000;

        if (clientOS == 0 ) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015 ) {
                System.out.println( "Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }

    public static void exerciseThree() {
        int year = 1700;
        if ( (year % 4 == 0)  && ( year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println( year + " год является високосным");
        }
       /* else if ( year % 100 == 0) {
            System.out.println( year + " год не является високосным");
        }*/
        else  {
            System.out.println( year + " год не является високосным"); }
    }

    public static void exerciseFour() {
        int deliveryDistance = 95;
        int deliveryTime = 1;


        if (deliveryDistance <= 20 ) {
            System.out.println("Потребуется дней: " + deliveryTime );
        }
        else if ( deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        }

    }

    public static void exerciseFive() {
        int monthNumber = 50;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такой месяц не существует");
        }

    }


}




