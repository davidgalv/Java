//Nombre: inversov2
/*Calcular el inverso de un número. Para ello le daremos un numero por teclado.
 * Analisis: Para calcular el inverso hay que multiplicar por (-1).
 * El numero se consigue leyendolo del teclado. Se utilizarán numeros enteros.
 * 
 * Pseudocódigo Generalizado.
 * Inicio
 * Preguntar si quiere ejecutar.
 * Mientras yo quiera.
 * 	 Leer Número
 *	 Hacer inverso
 * Preguntar si quiere seguir.
 * Fin mientras.
 * Comprobar datos
 * Fin
 * */
 
import java.util.Scanner;
import java.io.*;
public class inversov2 {
	
	public static void main (String[] args) {
		
		//Inicio
		
		Scanner teclado = new Scanner (System.in);
		float numero;
		float inversa;
		char respuesta;
			//Preguntar si quiere ejecutar
			System.out.println ("Quieres ejecutar el programa?: Si/No");//Preguntar si quiere ejecutar
			respuesta = teclado.next().charAt(0);
				
				//Comprobar datos
			if (respuesta != 's' || respuesta !='S' || respuesta !='n'|| respuesta !='N') {
					System.out.println ("Escriba Si o No");
					respuesta = teclado.next().charAt(0);
				}
			else {		
				while (respuesta == 's' || respuesta == 'S') {
				
				//Obtener Numero
				System.out.println ("Dame el numero");
				numero = teclado.nextFloat();
			
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
					} //Fin while	
				}			
							
	} //Fin programa
}

