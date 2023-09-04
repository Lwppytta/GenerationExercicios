package Ex11p2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<String> n = new ArrayList<String>();
		
		for (int i=0;i<5;i++) {
			System.out.println("\nDigite uma cor:");
			n.add(leia.nextLine());
		}
		
		System.out.println("\nCores cadastradas: "+n);
		n.sort(null);
		System.out.println("\nCores ordenadas: "+n);
}}