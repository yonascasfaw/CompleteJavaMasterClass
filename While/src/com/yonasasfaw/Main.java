package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while(count !=6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=1; i!=6; i++){
//            System.out.println("Count value is " + i);
//        }
//
//        count = 6;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 67)
//                break;
//        }while(count != 6);


        //Challenge problem 1
//        isEvenNumber(55);
        int number = 5;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number ++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            count++;
            if(count == 5) {
                break;
            }
        }
        System.out.println("There are a total of " + count + " even numbers.");


    }
    public static boolean isEvenNumber(int num){
        if((num%2) == 0){
//            System.out.println("the number " + num + " is even.");
            return true;
        }
//        System.out.println("the number " + num + " is not even " );
        return false;
    }

}
