package Ex11p2;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> n = new HashSet<Integer>();
		
		for (int i=0;i<10;i++) {
			System.out.println("\nDigite um numero:");
			n.add(leia.nextInt());
		}
		
		System.out.println("\nApresenção: ");
		Iterator<Integer> m = n.iterator();
		
		while(m.hasNext()) {
			System.out.println(m.next());
		}
}}