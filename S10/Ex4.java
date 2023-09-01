package Ex10;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String c="s";
		int i, s, t, b=0, f=0, m=0, f2=0;;
		
		while (c.equals("s") || c.equals("S")) {
			System.out.println("\nDigite sua idade: ");
			i = leia.nextInt();
			System.out.println("\nSexo (1 Masculina/2 Feminino/3 Outros): ");
			s = leia.nextInt();
			System.out.println("\nCategoria (1 – Backend/2 – Frontend/3 – Mobile/4 – FullStack):");
			t = leia.nextInt();
			System.out.println("\nDeseja continuar? (S/N)");
			c = leia.next();
			
			switch (t) {
				case 1:
					b++;
					break;
				}
			
			if (s==2 && t==2) {
				f++;
			}
			
			if (s==1 && t==3 && i>40) {
				m++;
			}
			
			if (s==2 && t==4 && i<30) {
				f2++;
			}
			
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+b);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+f);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+m);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos "+f2);
	}

}
