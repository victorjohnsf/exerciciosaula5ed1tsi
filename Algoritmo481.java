package exercicios;
import java.util.Scanner;
public class Algoritmo481 {
	public static void main(String[] args) {
		int num,base,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("\ndigite numero maior ou igual a 0: ");
		num = scan.nextInt();
		while(num < 0) {
			System.out.println("\nNumero negativo.Digite numero maior ou igual a 0: ");
			num = scan.nextInt(); } 
		System.out.println("\ndigite a base em deseja representa-lo(2-10): ");
		base = scan.nextInt();
		while (base <2 || base >10){
			System.out.println("\nNao sei converter.Digite a base em deseja representa-lo(2-10): ");
			base = scan.nextInt(); } 
		c = converte(num,base);
		System.out.println("\nnumero em decimal: " + num);
		System.out.println("\nnumero na base " + base + " : " + c);
		System.out.println();
		
	}
	public static int converte(int nnum,int nbase) {
		int b = 0; 
		int nb = 0;
		while ( nnum >= nbase ) {
			int r = nnum % nbase; 
			nb = nb + (int) Math.pow(10,b) * r; 
			nnum = nnum/nbase; 
			b++; 
		}
		nb = nb + (int) Math.pow(10,b) * nnum;
		return nb;
	}

}
