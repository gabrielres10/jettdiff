import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cant = sc.nextInt();
		String entrada ="";
		for (int n = 0; n < cant; n++) {
			int size = sc.nextInt();
			entrada = sc.next().toUpperCase();
			boolean flag = true;
			
			for (int i = 0; i < size; i++) {
				flag = extremos(entrada,entrada.charAt(i));
				
			}
			
			if(!flag) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		
			
		}
		
	}
	
	public static boolean extremos(String a, char b) {
		boolean concentrao = false;
		int x= 0;
		int d = 0;
		int repeat = 0;
		int i = 0;
		char repetida = '.';
		
		for (i = 0; i<a.length(); i++) {
			
			repetida = a.charAt(i);
			if(repetida==b) {
				repeat ++;
			}
		}
		
		if (repeat > 1) {
			x =0; d = 0;
			System.out.println(repetida + " está repetido ");
			for (int j = a.length(); j>0; j--) {
				if(a.charAt(j-1)==b) {
					x = j-1;
					System.out.println("por derecha "+x);
					break;
				}
			}
			for (int j = 0; j<a.length(); j++) {
				if(a.charAt(j)==b) {
					d = j;
					System.out.println("por izquierda "+ d);
					break;
				}
			}
		}
		System.out.println(Math.abs(x - d));
		if ( Math.abs(x - d) != 1) {
			concentrao = false;
		}
		
		return concentrao;
	}
}
