package ru.spypro.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        exerciseOne();
       exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();

    }

    public static void exerciseOne() {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
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
        if ( (year % 4 == 0)  & (year % 400 == 0)) {
            System.out.println( year + " год является високосным");
        }
        else if ( year % 100 == 0) {
            System.out.println( year + " год не является високосным");
        }
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
                System.out.println("Январь");

            case 2:
                System.out.println("Февраль");

            case 3:
                System.out.println("Март");

            case 4:
                System.out.println("Апрель");

            case 5:
                System.out.println("Май");

            case 6:
                System.out.println("Июнь");

            case 7:
                System.out.println("Июль");

            case 8:
                System.out.println("Август");

            case 9:
                System.out.println("Сентябрь");

            case 10:
                System.out.println("Октябрь");

            case 11:
                System.out.println("Ноябрь");

            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такой месяц не существует");
        }

    }


}




