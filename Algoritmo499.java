package exercicios;
import java.util.Scanner;
public class Algoritmo499 {


	    public static void main(String[] args) {
	        int[] num = new int[5];
	        int L, flag = 0, op;

	        do {
	            System.out.println("\n\n\n");
	            System.out.println("MENU VETOR - FUNCAO");
	            System.out.println("\n1. Dados do VETOR");
	            System.out.println("2. Ordena VETOR");
	            System.out.println("3. Imprime VETOR");
	            System.out.println("4. Sai do programa");
	            System.out.print("OPCAO: ");

	            Scanner scan = new Scanner(System.in);
	            op = scan.nextInt();

	            switch (op) {
	                case 1:
	                    entrada(num, 5);
	                    flag = 1;
	                    break;
	                case 2:
	                    if (flag == 1) {
	                        ordena(num, 5);
	                    } else {
	                        System.out.println("\nEscolha primeiro a opcao 1.");
	                    }
	                    break;
	                case 3:
	                    if (flag == 1) {
	                        imprime(num, 5);
	                    } else {
	                        System.out.println("\nEscolha primeiro a opcao 1.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("\nSaindo do Algoritmo");
	                    break;
	                default:
	                    System.out.println("\nOpcao invalida");
	            }

	        } while (op != 4);

	        System.out.println("\n");
	    }

	    private static void entrada(int[] vet, int t) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("\nEntrada do VETOR");
	        for (int L = 0; L < t; L++) {
	            System.out.print("Digite numero " + (L + 1) + ": ");
	            vet[L] = scan.nextInt();
	        }
	    }

	    private static void imprime(int[] vet, int t) {
	        System.out.println("\nVETOR");
	        for (int L = 0; L < t; L++) {
	            System.out.println(" " + (L + 1) + ": " + vet[L]);
	        }
	    }

	    private static void ordena(int[] vet, int tam) {
	        int aux;

	        for (int L1 = 0; L1 < tam - 1; L1++) {
	            for (int cl = L1 + 1; cl < tam; cl++) {
	                if (vet[L1] > vet[cl]) {
	                    aux = vet[L1];
	                    vet[L1] = vet[cl];
	                    vet[cl] = aux;
	                }
	            }
	        }
	    }
	}
