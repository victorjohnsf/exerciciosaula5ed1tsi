package exercicios;
import java.util.Scanner;
public class Algoritmo495 {


	    public static void main(String[] args) {
	        int L;
	        String[][] nome = new String[5][20];
	        Scanner scan = new Scanner(System.in);

	        for (L = 0; L < 5; L++) {
	            System.out.print("Digite nome: ");
	            nome[L][0] = scan.nextLine();
	        }

	        ordena(nome, 5);

	        System.out.println("\n\nNOMES ORDENADOS\n");

	        for (L = 0; L < 5; L++) {
	            System.out.println("\n" + (L + 1) + " - " + nome[L][0]);
	        }

	        // Feche o Scanner após o uso
	        scan.close();
	    }

	    private static void ordena(String[][] vet, int tam) {
	        int Li, ci;
	        String aux;

	        for (Li = 0; Li < tam - 1; Li++) {
	            for (ci = Li + 1; ci < tam; ci++) {
	                if (vet[Li][0].compareTo(vet[ci][0]) > 0) {
	                    aux = vet[Li][0];
	                    vet[Li][0] = vet[ci][0];
	                    vet[ci][0] = aux;
	                }
	            }
	        }
	    }
	}
