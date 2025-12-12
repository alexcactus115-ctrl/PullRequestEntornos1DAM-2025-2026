package Ejercicio1;

import java.util.Scanner;

public class PiedraPapelTijeras {
	public static void main(String[] args) {
		// numero a tijera
		// combinaciones
		// casos en los que gano
		//int 
		Scanner teclado = new Scanner(System.in);
		String cosa = "";
		int pc = (int)(3 * Math.random()) + 1;
		
		System.out.println("\tVamos a jugar piedra papel o tijera :)");
		System.out.println("Pon alguna de las opciones para jugar: ");
		cosa = teclado.nextLine();
		
		cosa = cosa.toLowerCase();
		
		String resultado = "";
		String cosaStringUsuario = "";
		String cosaStringPc = "";
		
		// cosas player
		if (cosa.equals("piedra")) {
			cosaStringUsuario = "piedra";
		} else if (cosa.equals("papel")) {
			cosaStringUsuario = "Papel";
		} else if (cosa.equals("tijera")) {
			cosaStringUsuario = "tijera";
		} else {
			System.err.println("No elegiste nada, PERDISTE POR TONTO");
		}
		
		// cosas pc
		if (pc == 1) {
			cosaStringPc = "piedra";
		} else if (pc == 2) {
			cosaStringPc = "Papel";
		} else if (pc == 3) {
			cosaStringPc = "tijera";
		}
		
		// casos
		if (cosa.equals("piedra") && pc == 3) {
			resultado = "GANASTE!!";
		} else if (cosa.equals("papel") && pc == 1) {
			resultado = "GANASTE!!";
		} else if (cosa.equals("tijera") && pc == 2) {
			resultado = "GANASTE!!";
		} else if (cosa.equals(cosaStringPc)) {
			resultado = "EMPATE!!";
		} else {
			resultado = "PERDISTE!!";
		}
		
		System.out.println(resultado + " tu sacaste " + cosaStringUsuario + " y el pc saco " + cosaStringPc);
		
		//haz un progrma en java que juegue que pregunte una de estas tres palabras piedra papel o tijera
		//el programa generara una de estas palabras de forma aleatoria y teniendo en cuenta estas reglas
	}
}
