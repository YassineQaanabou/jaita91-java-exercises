package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAndCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una lista di numeri separati dalla virgola");
        String numList = scan.nextLine();

        String[] arrayNumList = numList.split(",");
        System.out.println(Arrays.toString(arrayNumList));


        int counter = 0;

        for (int i = 0; i < arrayNumList.length; i++) {

            if (Integer.parseInt(arrayNumList[i]) >= 1 && Integer.parseInt(arrayNumList[i]) <= 10 && Integer.parseInt(arrayNumList[i]) % 2 == 0) {

                counter++;


            }
        }
        System.out.println(counter);

        scan.close();


    }
}
