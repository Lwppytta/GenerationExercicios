package Ex11p2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<Integer> n = new ArrayList<Integer>();
		n.add(2);
		n.add(5);
		n.add(1);
		n.add(3);
		n.add(4);
		n.add(9);
		n.add(7);
		n.add(8);
		n.add(10);
		n.add(6);
		
		int b, c=0;
		boolean d=false;
		
		System.out.println("\nDigite um numero:");
		b=leia.nextInt();
		
		for (int i=0;i<10;i++) {
			c=n.get(i);
			if(c==b) {
				System.out.println("\nPosição: "+i);
				d=true;
			}}
		if(d!=true) {
			System.out.println("\nNumero não encontrado.");
		}
		
		//System.out.println("\nPosição: "+n.indexOf(b));
}}