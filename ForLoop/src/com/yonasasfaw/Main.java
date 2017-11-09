package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10_000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10_000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10_000.0, 5.0));

//        for (int i = 0 ; i < 5; i++){
//            System.out.println("Loop " + i + " hello!");
//        }

        //challenge problem 1

        for (int interestRate = 2; interestRate < 9; interestRate++){
            System.out.println("10,000 at " + interestRate + "% interest = "
                    + String.format("%.2f",calculateInterest(10_000.0, interestRate)));
        }

        //challenge problem 2
        System.out.println("********************************");

        for (int interestRate = 8; interestRate > 1; interestRate--){
            System.out.println("10,000 at " + interestRate + "% interest = "
                    + String.format("%.2f",calculateInterest(10_000.0, interestRate)));
        }

        System.out.println("********************************");


        //challenge problem 3
        int count = 0;
        for (int i = 40; i < 100; i++){
            if(isPrime(i)) {
                System.out.println(i + " is a prime number.");
                count++;
                System.out.println(i + "th value of " + count);
                if (count == 3) {
                    break;
                }
            }

        }



    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }
}
