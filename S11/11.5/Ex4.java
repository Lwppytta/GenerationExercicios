package Ex11p2;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> n = new HashSet<Integer>();
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
		
		int b;
		
		System.out.println("\nDigite um numero:");
		b=leia.nextInt();
		
		if (n.contains(b)) {
			System.out.println("\nO numero "+b+" existe na lista!");
		} else {
			System.out.println("\nO numero "+b+" não existe na lista!");
		}
}}