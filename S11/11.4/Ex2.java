package Ex11;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int v[] = new int[10], m[]=new int[10], n[]=new int[10], i=0, s=0;
		float d;
		
		for(int j=0;j<10;j++) {
			System.out.println("\nDigite os numeros: ");
			v[j] = leia.nextInt();
		}
		for(int j=0;j<10;j++) {
			if(j%2==1) {
				m[i]=v[j];
				i++;
			}}
		System.out.println("\nElemnetos nos indices impares: ");
		for(int a=0;a<i;a++) {
			System.out.println(m[a]);
		}
		i=0;
		for(int j=0;j<10;j++) {
			if(v[j]%2==0) {
				n[i]=v[j];
				i++;
			}}
		System.out.println("\nElemnetos pares: ");
		for(int a=0;a<i;a++) {
			System.out.println(n[a]);
		}
		for(int j=0;j<10;j++) {
			s+=v[j];
			}
		d=s/v.length;
		System.out.println("\nSoma: "+s+"\nMedia: "+d);		
}}