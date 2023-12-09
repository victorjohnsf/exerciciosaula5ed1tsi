package exercicios;
import java.util.Scanner;

public class Algoritmo490 {
	
	    public static void main(String[] args) {
	        String[] nome = new String[10];
	        int L;
	        Scanner scan = new Scanner(System.in);

	        for (L = 0; L < 10; L++) {
	            System.out.println("Digite uma palavra em letras minúsculas " + (L + 1) + ": ");
	            nome[L] = scan.nextLine();
	            restantes(nome, nome[L].length(), "c");
	        }

	        for (L = 0; L < 10; L++) {
	            System.out.println("\n" + (L + 1) + " - " + nome[L]);
	        }

	        System.out.println();

	        
	        scan.close();
	    }

	    private static void restantes(String[] vet, int tam, String x) {
	        int cont = 0;

	        for (int i = 0; i < tam; i++) {
	            if (vet[i].equals(x)) {
	                vet[i] = "*";
	                cont++;
	            }
	        }
	        
	        // Você pode fazer algo com 'cont' aqui, se necessário.
	    }
	}
