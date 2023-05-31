/*Consegna: Il programma dovrà chiedere all’utente il numero (intero) di
      chilometri che vuole percorrere e l’età del passeggero (numero intero).
      Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio,
      secondo queste regole:
      il prezzo del biglietto è definito in base ai km (0.21 € al km)
      va applicato uno sconto del 20% per i minorenni
      va applicato uno sconto del 40% per gli over 65
      Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner,
      come visto in classe stamattina.
      Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe
      DecimalFormat
              */

package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoloBigliettoTreno {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Inserire Km da percorrere");
        int kmPercorrere = keyboardReader.nextInt();

        System.out.println("Inserire età del passeggero");
        int etaPasseggero = keyboardReader.nextInt();

        double prezzoKm = 0.21;
        double prezzoCorsa = prezzoKm * kmPercorrere;
        double prezzoFinale = 0;
        double scontoUnder = 0.80;
        double scontoOver = 0.60;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");


        if (etaPasseggero < 18) {
            prezzoFinale = prezzoCorsa * scontoUnder;
            System.out.println("Il prezzo della corsa è di : " + decimalFormat.format(prezzoFinale) + "€");
        } else if (etaPasseggero >= 65) {
            prezzoFinale = prezzoCorsa * scontoOver;
            System.out.println("Il prezzo della corsa è di : " + decimalFormat.format(prezzoFinale) + "€");
        } else {
            System.out.println("Il prezzo della corsa è di : " + decimalFormat.format(prezzoCorsa) + "€");

        }

    }
}
