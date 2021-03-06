//Nombre: valorabsoluto
/*Calcular el valor absoluto.
 * Analisis: Si el numero < 0 entonces se multiplicaria por -1.
 * 			 Si el numero > 0 entonces se queda asi.
 * El numero se consigue leyendolo del teclado. Se utilizarán numeros enteros.
 * 
 * Pseudocódigo Generalizado:
 * Inicio
 * 	Preguntar si quiere ejecutar y validar
 * 	Mientras el usuario quiera
 * 		Leer Número
 * 		Hacer valor absoluto y mostrar resultados
 * 	Fin mientras
 * Fin
 * */
 
import java.util.Scanner;
import java.io.*;
public class valorabsoluto
{
	
		public static void main (String [] args) throws java.io.IOException
			{
				//Inicio
				Scanner teclado = new Scanner (System.in);
				float numero;
				char respuesta;
				
				//Preguntar si quiere ejecutar
				System.out.println ("Desea ejecutar el programa? Si/No");
				respuesta = teclado.next().charAt(0);
				
				do {
					System.out.println ("Si o no?");
					respuesta = teclado.next().charAt(0);
				}
				while (respuesta !='s' && respuesta !='S' && respuesta !='n' && respuesta !='N');	
				
					while (respuesta == 's' || respuesta == 'S') { //Mientras el usuario quiera
					
					//leerNumero
					System.out.println ("Dame el numero");
					numero = teclado.nextFloat();
					
					//hacerValorAbsoluto
					if (numero >= 0) {
						System.out.println ("El valor absoluto es "+numero);
					 }
					else 
						System.out.println ("El valor absoluto es "+numero*(-1));
					
					//Preguntar si quiere volver a hacerlo
						System.out.println ("Quiere volver a hacerlo?");
						respuesta = teclado.next().charAt(0);
						do {
						System.out.println ("Si o no?");
						respuesta = teclado.next().charAt(0);
						}
						while (respuesta !='s' && respuesta !='S' && respuesta !='n' && respuesta !='N');
				}
					
	}	
}		 			
