//Nombre: inversov2
/*Calcular el inverso de un número. Para ello le daremos un numero por teclado.
 * Analisis: Para calcular el inverso hay que multiplicar por (-1).
 * El numero se consigue leyendolo del teclado. Se utilizarán numeros enteros.
 * 
 * Pseudocódigo Generalizado.
 * Inicio
 * Preguntar, leer y validar si quiere ejecutar.
 * Mientras yo quiera.
 * 	 Leer Número
 *	 Hacer inverso
 * Preguntar si quiere seguir.
 * Fin mientras.
 * Fin
 * */
 
import java.util.Scanner;
import java.io.*;
public class inversov2 {
	
	public static void main (String[] args) {
		
		//Inicio
		
		Scanner teclado = new Scanner (System.in);
		int numero;
		int inversa;
		char respuesta;
			//Preguntar si quiere ejecutar y validar
					
			do {
				System.out.println ("Quieres ejecutar el programa?: Si/No");//Preguntar si quiere ejecutar
				respuesta = teclado.next().charAt(0);
			}
			while (respuesta !='s' && respuesta !='S' && respuesta !='n' && respuesta !='N');
			
				while (respuesta == 's' || respuesta == 'S') {
				
				//Obtener Numero
				System.out.println ("Dame el numero");
				numero = teclado.nextInt();
			
					//Hacer Inverso
					if (numero != 0) {
						inversa = numero*(-1);
						System.out.println ("El inverso es " +inversa);
					}	
					else { //error
						System.out.println ("El numero no puede ser cero");
		}
				//Preguntar si quiere seguir
				System.out.println("Quieres volver a hacerlo?: (s/n)");
				respuesta = teclado.next().charAt(0);
					do {
					System.out.println ("Si/No");
					respuesta = teclado.next().charAt(0);
					}
					while (respuesta !='s' && respuesta !='S' && respuesta !='n' && respuesta !='N');
					
					} //Fin while	
	} //Fin programa
}

