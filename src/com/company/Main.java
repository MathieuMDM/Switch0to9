package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 9 to find out how to spell it in English: ");
        int numero = scanner.nextInt();
        String word;
        switch (numero) {
            case 0:
                word = "ZERO";
                break;
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
                break;
        }

        System.out.println(word);
    }

}

// exp 2

//public class NumberInWord {
//    public static void printNumberInWord(int num){
//        String word="OTHER";
//        switch (num){
//            case 0: word="ZERO";break;
//            case 1: word="ONE";break;
//            case 2: word="TWO";break;
//            case 3: word="THREE";break;
//            case 4: word="FOUR";break;
//            case 5: word="FIVE";break;
//            case 6: word="SIX";break;
//            case 7: word="SEVEN";break;
//            case 8: word="EIGHT";break;
//            case 9: word="NINE";break;
//        }
//        System.out.println(word);
//    }
//}
