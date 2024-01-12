package t1.examen;

import java.util.Scanner;

public class ej4 {
	
	public static boolean esPolindroma(String cadena) { /*Creamos la funcion polindroma*/
		cadena=cadena.replace(" ", ""); /*Quitamos los espacios*/
		cadena=cadena.toLowerCase(); /*La cadena en minuscula*/
		
		StringBuilder cadenaAlReves = new StringBuilder(); /*Un StringBuilder para modificar la cadena*/
		
		for(int i = cadena.length()-1; i>=0; i--) {
			cadenaAlReves.append(cadena.charAt(i));
		}
		
		return cadena.equals(cadenaAlReves.toString()); /*Devuelve la comparacion de las cadenas*/
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		System.out.println("Introduce una frase: ");
		cadena=sc.nextLine();
		
		if(esPolindroma(cadena)) { /*Condicion donde se llama a la funcion para que diga si es polindroma o no*/
			System.out.println("Es polindroma");
		}else {
			System.out.println("No es polindroma");
		}
	}
	
}