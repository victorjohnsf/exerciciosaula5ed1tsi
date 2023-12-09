package exercicios;
import java.util.Scanner;
public class Algoritmo497 {

	    public static void main(String[] args) {
	        int L, c, n;
	        int[] num = new int[10];
	        Scanner scan = new Scanner(System.in);

	        for (L = 0; L < 10; L++) {
	            System.out.print("Digite numero " + (L + 1) + ": ");
	            num[L] = scan.nextInt();
	        }

	        System.out.print("Digite numero de busca: ");
	        n = scan.nextInt();

	        ordena(num, 10);
	        c = busca(num, 10, n);

	        System.out.println("\nVETOR");
	        for (L = 0; L < 10; L++) {
	            System.out.println((L + 1) + " - " + num[L]);
	        }

	        c++;
	        if (c != 0) {
	            System.out.println("\n\nPosicao no vetor: " + c);
	        } else {
	            System.out.println("\n\nNao encontrado");
	        }

	        scan.close();
	    }

	    private static int busca(int[] vet, int tam, int chave) {
	        int ini = 0;
	        int fim = tam - 1;
	        int meio;

	        while (ini <= fim) {
	            meio = (ini + fim) / 2;

	            if (chave == vet[meio]) {
	                return meio;
	            } else if (chave < vet[meio]) {
	                fim = meio - 1;
	            } else {
	                ini = meio + 1;
	            }
	        }

	        return -1;
	    }

	    private static void ordena(int[] vet, int tam) {
	        int L1, c1, aux;

	        for (L1 = 0; L1 < tam - 1; L1++) {
	            for (c1 = L1 + 1; c1 < tam; c1++) {
	                if (vet[L1] > vet[c1]) {
	                    aux = vet[L1];
	                    vet[L1] = vet[c1];
	                    vet[c1] = aux;
	                }
	            }
	        }
	    }
	}
