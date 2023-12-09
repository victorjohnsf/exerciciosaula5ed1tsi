package exercicios;
import java.util.Scanner;
public class Algoritmo494 {

	    public static void main(String[] args) {
	        int L, c;
	        String[] nome = new String[3];
	        String[] prof = new String[3];
	        String[] ender = new String[3];
	        Scanner scan = new Scanner(System.in);

	        for (L = 0; L < 3; L++) {
	            System.out.println("\nDigite nome: ");
	            nome[L] = scan.nextLine();
	            System.out.println("Digite endereco: ");
	            ender[L] = scan.nextLine();
	            System.out.println("Digite profissao: ");
	            prof[L] = scan.nextLine();
	        }

	        for (L = 0; L < 2; L++) {
	            for (c = L + 1; c < 3; c++) {
	                if (nome[L].compareTo(nome[c]) > 0) {
	                    troca(nome, L, c);
	                    troca(ender, L, c);
	                    troca(prof, L, c);
	                }
	            }
	        }

	        for (L = 0; L < 3; L++) {
	            System.out.println("\n" + nome[L] + "\t" + ender[L] + "\t" + prof[L]);
	        }

	        // Feche o Scanner após o uso
	        scan.close();
	    }

	    private static void troca(String[] arr, int idx1, int idx2) {
	        String aux = arr[idx1];
	        arr[idx1] = arr[idx2];
	        arr[idx2] = aux;
	    }
	}

