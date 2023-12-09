package exercicios;
import java.util.Scanner;
public class Algoritmo483 {
	public static void main(String[] args) {
		int L,c,aux;
		int num[] = new int [4];
		int num1[] = new int [4];
		Scanner scan = new Scanner(System.in);
		for (L= 0;L<4;L++) {
			System.out.println("\n\nDigite 1 numero " + (L+1) +  ": ");
			num[L] = scan.nextInt();}
		for (L=0; L<4;L++) {
			System.out.println("\n\nDigite 2 numero " + (L+1) + ": ");
			num1[L] = scan.nextInt();}
		c = produtoInterno(num, num1,4);
		System.out.println("\nVETOR A\tVETORB\n");
		for (L=0;L<4;L++) {
			System.out.println("\n" + num[L] + "\t" + num1[L]);} 
		System.out.println("\n\nproduto interno: " + c);
		System.out.println();
		}
	private static int produtoInterno(int[] vetor1, int[] vetor2, int quant) {
        int prod = 0;

        for (int i = 0; i < quant; i++) {
            prod += vetor1[i] * vetor2[i];
        }

        return prod;
    	}
		}
	
