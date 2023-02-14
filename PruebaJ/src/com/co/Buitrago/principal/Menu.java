package com.co.Buitrago.principal;


import java.util.Scanner;

import com.co.Buitrago.Implementaciones.Restar;
import com.co.Buitrago.Implementaciones.Sumar;

public class Menu {
	
	Scanner sc =  new Scanner(System.in);
	
	public void mostrarMenu() {
		
		System.out.println("Digite el numero uno: ");
		double numUno= sc.nextDouble();
		
		System.out.println("Digite el numero Dos");
		double numDos= sc.nextDouble();
		
		System.out.println("Que operacion desea hacer: ");
		int seleccion = sc.nextInt();
		
		
		switch (seleccion) {
		case 1:
			Sumar op = new Sumar();
			System.out.println(op.sumar(numUno, numDos));
			break;
		case 2:
			Restar op = new Restar();
			System.out.println(op.restar(numUno, numDos));
			break;
			
			

		default:
			break;
		}

	}
	
	

}
