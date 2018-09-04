package ru.telegin.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop(8);
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("8")) {
            System.out.println("1. Вывести все товары\n" +
                    "2. Добавить товар\n" +
                    "3. Добавить несколько товаров\n" +
                    "4. Удалить товар\n" +
                    "5. Удалить все товары\n" +
                    "6. Найти самый дешевый товар\n" +
                    "7. Найти самый дорогой товар\n" +
                    "8. Выход\n");
            answer = scanner.nextLine();
            if (answer.equals("1")){
                shop.printInfo();
            } else if(answer.equals("2")){
                System.out.println("Введите название товара");
                String product = "";
                int price = 0;
                shop.addProductName(product = scanner.nextLine());
                System.out.println("Введите цену товара");
                shop.addPrice(price = scanner.nextInt());
                System.out.println("Вы добавили товар - " + product + " с ценой - " + price);
            }else if(answer.equals("3")){
                String stop = "";
                String product = "";
                int price = 0;
                while (!shop.equals("stop")){
                    System.out.println("Введите название товара");
                    shop.addProductName(product = scanner.nextLine());
                    System.out.println("Введите цену товара");
                    shop.addPrice(price = scanner.nextInt());
                    System.out.println("Вы добавили товар - " + product + " с ценой - " + price);
                    System.out.println("Нажмите stop для выхода, либо любую клавишу для продолжения");
                    scanner = new Scanner(System.in);
                    stop = scanner.nextLine();
                    if(stop.equals("stop")){
                        break;
                    }
                }
                shop.addProductName();
            } else if(answer.equals("4")){
                shop.removeProduct();
            } else if(answer.equals("5")){
                shop.removeProduct();
            } else if(answer.equals("6")) {
                shop.getMinProduct();
            } else if(answer.equals("7")){
                shop.getMaxProduct();
            } else if(answer.equals("8")){
                break;
            }

            System.out.println("Для выхода нажмите 8, для продолжения любую клавишу");
            scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        }
    }
}
