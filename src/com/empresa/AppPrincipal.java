package com.empresa;

import java.util.Scanner;

//EJERCICIO: Suponga  que un individuo desea invertir su capital en un banco y desea saber cuanto dinero ganara despues de un mes si el banco paga a razon de 2% mensual.

public class AppPrincipal {
	

	public static void main(String[] args) {
//QUE VARIABLES NECESITO 
		float capital = 0;
		float ganancia = 0;
	
//PARA INGRESAR DATOS ME CREO UN SCANNER
		Scanner teclado = new Scanner(System.in);
		
//QUE ENTRA A MI APP
	   System.out.println("INGRESE EL CAPITAL QUE DESEA INVERTIR");
	   
//CAPTURO EL DATO INGRESADO POR EL TECLADO
		capital = teclado.nextFloat(); 
		
	System.out.println("USTED INVERTIRA " + capital +" PESOS POR 30 DIAS");
		
//QUE SE PROCESA EN MI APP-CALULO LA GANANCIA
	ganancia =  capital * 0.02f;
	
//QUE SALE DE MI APP 	
	System.out.println("SU GANANCIA EN 30 DÍAS SERA DE " + ganancia +  " PESOS");
			
 

	}

}