package t1.examen;

import java.util.Scanner;

public class ej1 {
	
	public static boolean confirmacion() { /*Funcion booleana que devuelve true o false*/
		Scanner sc = new Scanner(System.in);
		String respuesta;
		int contadorIntentos = 0;
		
		while(contadorIntentos<3) { /*Cuando supere los 3 intentos no podra introducir nada mas*/
				System.out.println("¿Desea confirmar?");
				System.out.println("Para confirmar, introduce: s, S, sí, SI, Sí, j, ja, JA, Ja");
				System.out.println("Para negar, introduce: n, N, no, NO, No, nein, NEIN, Nein");
				respuesta = sc.next();
				contadorIntentos++;
				
				switch(respuesta) { 
				case "s", "S", "sí", "SI", "Sí","j", "ja", "JA", "Ja":
					return true;
				case "n", "N", "no", "NO", "No","nein", "NEIN","Nein":
					return false;
				default:
					System.out.println("La respuesta introducida es incorrecta");
				}
		}
		System.out.println("Se superaron los intentos");
		return false; /*Devuelve false al superar los intentos*/
	}
	
	public static void main(String[] arg) {
		System.out.println(confirmacion()); /*Llamamos a la funcion en el main para que imprima el resultado*/
	}
}

