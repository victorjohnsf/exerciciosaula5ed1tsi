package exercicios;
import java.util.Scanner;
public class Algoritmo485 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L;
		int num[] = new int[6];
		String num1[] = new String[6];
		
		for (L = 0;L<6;L++) {
			System.out.print("Digite numero  " + (L+1) + ": ");
			num[L]= scan.nextInt();}
		scan.nextLine();
		for(L = 0;L<6;L++) {
			System.out.print("\nDigite caractere  " + (L+1) + ": ");
			num1[L] = scan.nextLine(); 
		} 
		System.out.println();
		multivetor( num, num1,6);
		System.out.println();
	}
	public static void multivetor(int[] vetl, String[] vet2,int tam){
		for (int i=0;i<tam;i++) {
			System.out.println();
			for (int w=0; w < vetl[i]; w++) {
				System.out.println(vet2[i]);}
			}
		}
}
