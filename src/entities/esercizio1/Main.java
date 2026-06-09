package entities.esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parole = new HashSet<>();
        ArrayList<String> duplicati = new ArrayList<>();
        boolean valido = false;
        int numElementi = 0;

        do {
            try {
                System.out.println("Quanti elementi vuoi creare ?");
                numElementi = Integer.parseInt(scanner.nextLine());
                if (numElementi <= 0) {
                    throw new EccezioneNumero("Devi inserire un numero maggiore di 0");
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Inserisci solo numeri interi");
            } catch (EccezioneNumero e) {
                System.out.println("Errore: " + e.getMessage());
            }
        } while (!valido);


        for (int i = 0; i < numElementi; i++) {
            System.out.println("Insersci la " + (i + 1) + "°" + " parola");
            String parola = scanner.nextLine();
            boolean aggiunto = parole.add(parola);
            if (!aggiunto) {
                System.out.println("Parola gia aggiunta al Set");
                duplicati.add(parola);
            }
        }

        System.out.println("Elementi di parole : " + parole.size());
        System.out.println("HashSet delle parole : " + parole);
        System.out.println("Elementi dei duplicati : " + duplicati.size());
        System.out.println("Array dei duplicati : " + duplicati);
    }
}
