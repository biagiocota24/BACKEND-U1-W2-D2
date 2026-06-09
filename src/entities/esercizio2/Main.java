package entities.esercizio2;

import java.util.*;

public class Main {

    static ArrayList<Integer> creaLista(int N) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int numRandom = random.nextInt(100) + 1;
            lista.add(numRandom);
        }
//        System.out.println(lista);
        return lista;
    }

    @Override
    public String toString() {
        return "Main{}";
    }

    static ArrayList<Integer> invertiLista(ArrayList<Integer> array) {
        Collections.reverse(array);
        return array;
    }

    static void stampaPariODispari(ArrayList<Integer> array, boolean pariodispari) {
        if (pariodispari) {
            for (int i = 0; i < array.size(); i += 2) {
                System.out.println(array.get(i));
            }
        } else {
            for (int i = 1; i < array.size(); i += 2) {
                System.out.println(array.get(i));
            }
        }
    }


    public static void main(String[] args) {

        ArrayList<Integer> lista = creaLista(10);
        ArrayList<Integer> copiaLista = new ArrayList<>(lista);

        System.out.println(lista);

        ArrayList<Integer> listaInversa = invertiLista(copiaLista);
        System.out.println(lista + "" + listaInversa);

//        stampaPariODispari(lista, true);
    }
}
