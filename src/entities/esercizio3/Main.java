package entities.esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static void aggiungiAllaRubrica(HashMap<String, String> rubrica, String nome, String numeroDiTelefono) {
        rubrica.put(nome, numeroDiTelefono);
    }

    static void rimuoviContatto(HashMap<String, String> rubrica, String nome) {
        rubrica.remove(nome);
    }

    static String cercaPerNumero(HashMap<String, String> rubrica, String numero) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                System.out.println("Trovato : " + entry.getKey());
                return entry.getKey();
            }
        }
        return "numero non trovato!";
    }

    static String cercaPerNome(HashMap<String, String> rubrica, String nome) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getKey().equals(nome)) {
                System.out.println("Trovato : " + entry.getValue());
                return entry.getValue();
            }
        }
        return "Contatto non trovato!";
    }

    static void stampaContatti(HashMap<String, String> rubrica) {
        int indice = 1;
        for (Map.Entry<String, String> contatto : rubrica.entrySet()) {
            System.out.println("------------- " + indice + "° Contatto ---------------");
            System.out.println("CONTATTO : " + contatto.getKey());
            System.out.println("NUMERO . " + contatto.getValue());
            indice++;
        }
    }


    static void main(String[] args) {

        HashMap<String, String> rubrica = new HashMap<>();
        String[] nomi = {"biagio", "isabella", "Gigi", "Mamma", "papa", "Chiara", "aurora"};
        String[] numeri = {"3319156710", "3661234567", "3420459805", "3387284824", "3476007463", "3500912219", "0884551180"};


        for (int i = 0; i < nomi.length; i++) {
            aggiungiAllaRubrica(rubrica, nomi[i], numeri[i]);
        }
        rimuoviContatto(rubrica, "aurora");

        cercaPerNumero(rubrica, "3319156710");
        cercaPerNome(rubrica, "biagio");

        stampaContatti(rubrica);

    }
}
