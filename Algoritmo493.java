package exercicios;
import java.util.Scanner;
public class Algoritmo493 {

	    public static void main(String[] args) {
	        int L, c;
	        int[] num = new int[10];
	        Scanner scan = new Scanner(System.in);

	        for (L = 0; L < 10; L++) {
	            System.out.print("Digite um número " + (L + 1) + ": ");
	            num[L] = scan.nextInt();
	        }

	        c = verificaOrdem(num, 10);

	        if (c == 1) {
	            System.out.println("\nORDENACAO CRESCENTE");
	        } else if (c == 2) {
	            System.out.println("\nORDENACAO DECRESCENTE");
	        } else {
	            System.out.println("\nNAO ESTA ORDENADO");
	        }

	        // Feche o Scanner após o uso
	        scan.close();
	    }

	    private static int busca(int[] vet, int tam) {
	        int x = 0;
	        for (int i = 0; i < tam - 1; i++) {
	            if (vet[i] < vet[i + 1]) {
	                x = 0;
	                return x;
	            }
	        }
	        x = 1;
	        return x;
	    }

	    private static int buscaInvertida(int[] vet, int tam) {
	        int x = 0;
	        for (int i = 0; i < tam - 1; i++) {
	            if (vet[i] > vet[i + 1]) {
	                x = 0;
	                return x;
	            }
	        }
	        x = 1;
	        return x;
	    }

	    private static int verificaOrdem(int[] vetor, int t) {
	        int r = busca(vetor, t);
	        int res;

	        if (r == 1) {
	            res = 2;
	            return res;
	        } else {
	            r = buscaInvertida(vetor, t);
	            if (r == 1) {
	                res = 1;
	                return res;
	            } else {
	                res = 0;
	                return res;
	            }
	        }
	    }
}
	
