//Nombre: inverso
/*Algoritmo que calcule e imprima el inverso de un número dado por teclado.
El numero inverso se obtiene multiplicando por -1.
Requisitos: El numero no puede ser cero.
			El numero será entero.
Pseudocódigo generalizado:
* Inicio
* ObtenerNumero
* Hacer inverso
* Fin
* */

import java.util.Scanner;
import java.io.*;		
public class inverso
{
	public static void main (String args[]) throws java.io.IOException
		{
			Scanner teclado = new Scanner (System.in);
			float numero;
			float inversa;
			
			//Obtener Numero
			System.out.println ("Dame el numero");
			numero = teclado.nextFloat();
			
			//Hacer Inverso
			if (numero != 0) {
				inversa = numero*(-1);
				System.out.println ("El inverso es " +inversa);
			}
			else {
				System.out.println ("El numero no puede ser cero");
		}
	}
}	
