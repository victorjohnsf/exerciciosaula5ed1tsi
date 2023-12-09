 package exercicios;
import java.util.Scanner;
public class Algoritmo487 {
	public static void main(String[] args) {
		int L,n;
		int num[] = new int[10];
		Scanner scan = new Scanner(System.in);
		for(L=0; L<10; L++) {
			System.out.print("Digite numero " + (L+1) + ": ");
			num[L] = scan.nextInt();}
		inverte(num, 10); 
		System.out.println("\nVETOR\n");
		for (L=0; L<10;L++) {
			System.out.println("\n" + (L+1) + " - " + num[L]);}
		System.out.println();
	}
	public static void inverte(int[]vet,int max) {
		int k = max;
		for (int i=0;i<max/2;i++) {
			int aux = vet [i];
			k--;
			vet[i] = vet [k];
			vet[k] = aux; 
		}
	}
}
