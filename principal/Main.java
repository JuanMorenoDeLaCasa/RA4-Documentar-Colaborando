/**
 * La clase principal del programa que realiza pruebas de la biblioteca es la "calculadora".
 * @author Eduardo
 * @version 0.1
 * @since 1.0
 */
package principal;

import calculadora.*;

public class Main {
	public static void main(String[] args) {
		//Prueba Suma
		Suma suma = new Suma();
		System.out.println("Vamos a sumar dos reales, el 2.8 y el 17.4");
		System.out.println("El resultado es: " + suma.dosReales(2.8f, 17.4f));
		System.out.println("Ahora sumaremos dos enteros: el 60 y el 90");
		System.out.println("El resultado es: " + suma.dosEnteros(60, 90));
		System.out.println("También hay que sumar tres reales: 53.24, 36.54 y 75.15");
		System.out.println("El resultado es: " + suma.tresReales(53.24f, 36.54f, 75.15f));
		System.out.println("Por Último probaremos a acumular números : " + suma.sumaAcumulado(6));
		System.out.println("Por Último probaremos a acumular números : " + suma.sumaAcumulado(9));
		System.out.println("Por Último probaremos a acumular números : " + suma.sumaAcumulado(20));
		System.out.println("==============================================================");
		//Prueba Resta
		Resta resta = new Resta();

		System.out.println("Vamos a restar dos reales, el 5.5 y el 3.2");
		System.out.println("El resultado es: " + resta.dosReales(5.5f, 3.2f));
		System.out.println("Ahora restaremos dos enteros: el 50 y el 20");
		System.out.println("El resultado es: " + resta.dosEnteros(50, 20));
		System.out.println("También hay que restar tres reales: 6.5, 1.2 y 3.1");
		System.out.println("El resultado es: " + resta.tresReales(6.5f, 1.2f, 3.1f));
		System.out.println("Por Último probaremos a acumular números : " + resta.restaAcumulado(134));
		System.out.println("Por Último probaremos a acumular números : " + resta.restaAcumulado(22));
		System.out.println("Por Último probaremos a acumular números : " + resta.restaAcumulado(5));
		System.out.println("==============================================================");