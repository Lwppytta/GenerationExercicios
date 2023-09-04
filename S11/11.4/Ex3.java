package Ex11;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int m[][] = new int[3][3], d1=0,d2=0, t=2;
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.println("\nDigite o valor na posição ["+l+"]["+c+"]:");
				m[l][c] = leia.nextInt();
			}}
		System.out.println("\nElementos na diagonal 1: ");
		for(int i=0;i<3;i++) {
			d1+=m[i][i];
			System.out.println(m[i][i]);
			}
		System.out.println("\nElementos na diagonal 2: ");
		for(int i=0;i<3;i++) {
			d2+=m[i][t];
			System.out.println(m[i][t]);
			t--;
			}
		System.out.println("\nSoma da diagonal 1: "+d1);
		System.out.println("\nSoma da diagonal 2: "+d2);
	}}