package t1.examen;

import java.util.Scanner;

public class ej2 {
	public static long cambiarNumero(long numero, int posicion, int digito) { /*Creamos la funcion cambiarNumero que nos devolvera la solucion del numero con el digito cambiado*/
        String numerocambiado = Long.toString(numero); /*Convertimos el numero a String para cambiar el caracter(digito)*/
        char[] digitos = numerocambiado.toCharArray(); /*Creamos un array para cambiar el digito en la posicion*/
        String solucion;
        
        digitos[posicion - 1] = Character.forDigit(digito, 10); /*Cambiamos el digito, no me funciona al hacerlo con replace y e utilizado esta forma que encontre cuando estaba estudiando*/
        solucion = new String(digitos); /*El nuevo numero*/
        
        return Long.parseLong(solucion);
	}
	
	public static void main(String[] arg) {
		
		long numero;
		int posicion;
		int digito;
		Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Por favor, introduzca un número entero positivo: "); /*Pedimos el numero y, la posicion y el digito que quiere modificar*/
            numero = sc.nextLong();
            
            System.out.print("Introduzca la posición dentro del número: ");
            posicion = sc.nextInt();

            System.out.print("Introduzca el nuevo dígito: ");
            digito = sc.nextInt();

            long resultado = cambiarNumero(numero, posicion, digito); /*Llamamos a la funcion*/

            System.out.println("El número resultante es " + resultado);
        }catch(Exception e){
            System.out.println("Error al introducir el numero");
            
        }finally{
            System.out.println("Fin");
        }
	}
}
