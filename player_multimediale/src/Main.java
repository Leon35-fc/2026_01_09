import entities.elementoMultimediale;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Aggiungi elementi all'elenco");

        elementoMultimediale[] elements = new elementoMultimediale[6];

        for (byte i = 1; i < 6; i++){
            System.out.println("Inserisci il nome del file.");
            String title = scn.nextLine();
            System.out.println("Inserisci la durata del file. (Se è un'immagine premi 0.)");
            int duration = scn.nextInt();
            scn.nextLine();
            elements[i] = new elementoMultimediale(title, duration);
        }
//        elementoMultimediale el1 = new elementoMultimediale(title, duration);
        System.out.println(elements[1].getTitle());
        System.out.println(elements[1].getDuration());
        }
    }
