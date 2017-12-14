package com.yonas;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone();
        int choice = 1;
        do{
            myPhone.options();
            choice = scanner.nextInt();
            myPhone.choice(choice);
            scanner.nextLine();

        }while(choice != 1);





    }
}
