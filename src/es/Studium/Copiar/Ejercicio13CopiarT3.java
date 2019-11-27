package es.Studium.Copiar;

import java.util.Scanner;

public class Ejercicio13CopiarT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner teclado= new Scanner(System.in);
 
 String cad1, cad2;
 
	System.out.println("Escriba una cadena");
	cad1=teclado.nextLine();
	
	cad2=cad1;
	
	System.out.println(cad2);
 
	teclado.close();
	}

}
