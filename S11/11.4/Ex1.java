package Ex11;
import java.util.Arrays;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int v[]= {2,5,1,3,4,9,7,8,10,6}, b;
		boolean a=false;
		
		System.out.println("\nDigite o numero desejado: ");
		b = leia.nextInt();
		
		for (int i=0;i<10;i++) {
			if (v[i]==b) {
				System.out.println("\nO numero "+b+" esta na posição: "+i);
				a = true;
			}}
		if(a!=true) {
			System.out.println("\nNumero não encontrado.");
		}
		
		
		
}}