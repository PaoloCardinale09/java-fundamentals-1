/*  Consegna: Scrivi un programma che stampi i numeri da 1 a 100,
 ma per i multipli di 3 stampi “Fizz” al posto del numero e per i
  multipli di 5 stampi “Buzz”. Per i numeri che sono sia multipli di
  3 che di 5 stampi “FizzBuzz”.
Esempio: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz……
Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare
 (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)*/

package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi stampare?");
        int numeriDaStampare = keyboardReader.nextInt();

        if (numeriDaStampare < 1 || numeriDaStampare > 1000) {
            System.out.println("Inserire un numero tra 1 e 1000");
        } else {
            for (int i = 1; i <= numeriDaStampare; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
