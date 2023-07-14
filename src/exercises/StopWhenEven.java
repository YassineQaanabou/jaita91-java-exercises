package exercises;

import java.util.Scanner;

public class StopWhenEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber;

        do {

            System.out.println("inserisci un numero");
            inputNumber = Integer.parseInt(scanner.nextLine());

        }

        while (inputNumber%2 !=0);

        System.out.println("Il numero è pari");

    }
}



