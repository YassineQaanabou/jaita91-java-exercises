package exercises;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("inserisci la prima parola");
            String word1 = input.nextLine();

            System.out.println("inserisci la seconda parola");
            String word2 = input.nextLine();


            if (word1.length() > word2.length()) {

                System.out.println("la prima parola è più lunga");
            } else if (word2.length() > word1.length()) {
                System.out.println("la seconda parola è più lunga");

            } else {
                System.out.println("le due parole sono lunghe uguali");

            }
        }
    }

