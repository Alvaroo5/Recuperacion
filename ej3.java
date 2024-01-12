package t1.examen;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int altura;
		int anchura;
		
		System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
		altura=sc.nextInt();
		
		System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
		anchura=sc.nextInt();
		
		int[][] pecera = new int[altura][anchura]; /*Creamos un array con las dimensiones de la altura y la anchura*/
		
		for(int i=0; i<pecera.length; i++) {
			for(int j = 0; j<pecera.length; j++) {
				if(i==0) {
					System.out.println(pecera[i][j]=0);
				}
			}
		}
	}
}
