//package com.company;
//import java.util.Scanner;
//
//public class File {
//    static Scanner input = new Scanner(System.in);
//    static String cotvet = "";
//    static int pscore = 0;
//    static int cscore = 0;
//
//    static void game() {
//        int rand = (int) (Math.random() * 3);
//        String potvet = input.nextLine();
//        potvet.trim();
//        potvet.toLowerCase();
//        if (rand == 0 & potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага")) {
//            cotvet = "камень";
//        } else if (rand == 0 & potvet.equals("1") || potvet.equals("2") || potvet.equals("3")) {
//            cotvet = "1";
//        } else if (rand == 0 & potvet.equals("rock") || potvet.equals("scissors") || potvet.equals("paper")) {
//            cotvet = "rock";
//        } else if (rand == 1 & potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага")) {
//            cotvet = "ножницы";
//        } else if (rand == 1 & potvet.equals("rock") || potvet.equals("scissors") || potvet.equals("paper")) {
//            cotvet = "scissors";
//        } else if (rand == 1 & potvet.equals("1") || potvet.equals("2") || potvet.equals("3")) {
//            cotvet = "1";
//        } else if (rand == 2 & potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага")) {
//            cotvet = "бумага";
//        } else if (rand == 2 & potvet.equals("rock") || potvet.equals("scissors") || potvet.equals("paper")) {
//            cotvet = "paper";
//        } else if (rand == 2 & potvet.equals("1") || potvet.equals("2") || potvet.equals("3")) {
//            cotvet = "3";
//        }
//        if (potvet.equals(cotvet)) {
//            System.out.println("ничья");
//        } else if (potvet.equals("камень") & cotvet.equals("ножницы") || potvet.equals("бумага") & cotvet.equals("камень") || potvet.equals("ножницы") & cotvet.equals("бумага")) {
//            System.out.println("игрок победил");
//            pscore++;
//        } else if (potvet.equals("ножницы") & cotvet.equals("камень") || potvet.equals("камень") & cotvet.equals("бумага") || potvet.equals("бумага") & cotvet.equals("ножницы")) {
//            System.out.println("компьютер победил");
//            cscore++;
//        }
//        System.out.println("игрок ответил " + potvet);
//        System.out.println("компьютер ответил " + potvet);
//        System.out.println("игрок набрал " + pscore + " очков");
//        System.out.println("компьютер набрал " + cscore + " очков");
//    }
//    public static void main (String[]args){
//
//        while (true) {
//            game();
//        }
//
//
//
//    }
//}