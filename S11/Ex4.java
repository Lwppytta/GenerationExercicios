package Ex11;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float m[][]=new float[10][4], s=0;
		float v[]=new float[10];
		
		for(int l=0;l<10;l++) {
			for(int c=0;c<4;c++) {
				System.out.println("\nAluno "+(l+1)+", digite a nota "+(c+1)+":");
				m[l][c] = leia.nextFloat();
			}}

		for (int a=0;a<10;a++) {
			for (int c=0;c<4;c++) {
				s=s+m[a][c];
				v[a]=s/4;
			}
		s=0;	
		}
		for(int l=0;l<10;l++) {
			System.out.println("\nNota aluno "+(l+1)+": "+v[l]);
			}
}}
