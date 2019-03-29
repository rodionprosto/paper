
package com.company;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String cotvet = "";
    static int pscore = 0;
    static int cscore = 0;
    static String stop="";


    static void game() {
        int rand = (int) (Math.random() * 3);
         String potvet = input.nextLine();
        potvet.trim();
        potvet.toLowerCase();
        stop = input.nextLine();

            if (potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага") || potvet.equals("1") || potvet.equals("2") || potvet.equals("3") || potvet.equals("scissors") || potvet.equals("paper") || potvet.equals("rock")) {
                if (rand == 0 & potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага")) {
                    cotvet = "камень";
                } else if (rand == 0 & potvet.equals("1") || potvet.equals("2") || potvet.equals("3")) {
                    cotvet = "1";
                } else if (rand == 0 & potvet.equals("rock") || potvet.equals("scissors") || potvet.equals("paper")) {
                    cotvet = "rock";
                }
                if (rand == 1 & potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага")) {
                    cotvet = "ножницы";
                } else if (rand == 1 & potvet.equals("rock") || potvet.equals("scissors") || potvet.equals("paper")) {
                    cotvet = "scissors";
                } else if (rand == 1 & potvet.equals("1") || potvet.equals("2") || potvet.equals("3")) {
                    cotvet = "2";
                }
                if (rand == 2 & potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага")) {
                    cotvet = "бумага";
                } else if (rand == 2 & potvet.equals("rock") || potvet.equals("scissors") || potvet.equals("paper")) {
                    cotvet = "paper";
                } else if (rand == 2 & potvet.equals("1") || potvet.equals("2") || potvet.equals("3")) {
                    cotvet = "3";
                }
                if (potvet.equals(cotvet)) {
                    System.out.println("ничья");
                    System.out.println("игрок ответил " + potvet);
                    System.out.println("компьютер ответил " + potvet);
                    System.out.println("игрок набрал " + pscore + " очков");
                    System.out.println("компьютер набрал " + cscore + " очков");
                } else if (potvet.equals("камень") & cotvet.equals("ножницы") || potvet.equals("1") & cotvet.equals("2") || potvet.equals("3") & cotvet.equals("1") || potvet.equals("2") & cotvet.equals("3") || potvet.equals("rock") & cotvet.equals("scissors") || potvet.equals("paper") & cotvet.equals("rock") || potvet.equals("scissors") & cotvet.equals("paper") || potvet.equals("бумага") & cotvet.equals("камень") || potvet.equals("ножницы") & cotvet.equals("бумага")) {
                    System.out.println("игрок победил");
                    pscore++;
                    System.out.println("игрок ответил " + potvet);
                    System.out.println("компьютер ответил " + potvet);
                    System.out.println("игрок набрал " + pscore + " очков");
                    System.out.println("компьютер набрал " + cscore + " очков");
                } else if (potvet.equals("ножницы") & cotvet.equals("камень") || potvet.equals("2") & cotvet.equals("1") || potvet.equals("3") & cotvet.equals("2") || potvet.equals("1") & cotvet.equals("3") || potvet.equals("scissors") & cotvet.equals("rock") || potvet.equals("rock") & cotvet.equals("paper") || potvet.equals("paper") & cotvet.equals("scissors") || potvet.equals("камень") & cotvet.equals("бумага") || potvet.equals("бумага") & cotvet.equals("ножницы")) {
                    System.out.println("компьютер победил");
                    cscore++;
                    System.out.println("игрок ответил " + potvet);
                    System.out.println("компьютер ответил " + potvet);
                    System.out.println("игрок набрал " + pscore + " очков");
                    System.out.println("компьютер набрал " + cscore + " очков");
                }
            } else if (!stop.equals("стоп") && !(potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага") || potvet.equals("1") || potvet.equals("2") || potvet.equals("3") || potvet.equals("scissors") || potvet.equals("paper") || potvet.equals("rock"))) {
                System.out.println("Ввведите корректно");
            }
        }

    public static void main (String[]args){

        while (true) {
            game();
      if (stop.equals("стоп")){
                break;
           }
        }



    }


//if (potvet.equals("камень") || potvet.equals("ножницы") || potvet.equals("бумага") || potvet.equals("1") || potvet.equals("2") || potvet.equals("3") || potvet.equals("scissors") || potvet.equals("paper") || potvet.equals("rock")){
//
//}
//else{
//   System.out.println("Ввведите корректно");
        //}