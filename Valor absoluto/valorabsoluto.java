//Nombre: valorabsoluto
/*Calcular el valor absoluto. Para ello le daremos un numero por teclado.
 * Analisis: Si el numero < 0 entonces se multiplicaria por -1.
 * 			 Si el numero > 0 entonces se queda asi.
 * El numero se consigue leyendolo del teclado. Se utilizarán numeros enteros.
 * 
 * Pseudocódigo Generalizado.
 * Inicio
 * Leer Número
 * Hacer valor absoluto
 * Fin
 * */
 
import java.util.Scanner;
import java.io.*;
public class valorabsoluto
{
	
		public static void main (String [] args) throws java.io.IOException
			{
				float numero;
				
				//leerNumero
				Scanner teclado = new Scanner (System.in);
				System.out.println ("Dame el numero");
				numero = teclado.nextFloat();
				
				//hacerValorAbsoluto
				if (numero >= 0) {
					System.out.println ("El valor absoluto es "+numero);
				 }
				else 
					System.out.println ("El valor absoluto es "+numero*(-1));	
						
			 }
 }			 			
