/**
 * Clase Cociente - Clase para realizar operaciones de cociente
 * @version 1.0.0
 * @since 17 de abril de 2023s
 */
package calculadora;

public class Cociente {

	/**
	 * Calcula el cociente de dos números reales
	 * @param a El primer número real
	 * @param b El segundo número real
	 * @return El cociente de los dos números reales
	 */

	public float dosReales(float a, float b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}
		return a / b;
	}


	/**
	 * Calcula el cociente de dos números enteros
	 * @param a El primer número entero
	 * @param b El segundo número entero
	 * @return El cociente de los dos números enteros
	 */
	public int dosEnteros(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}
		return a / b;
	}

	/**
	 * Calcula el inverso aditivo de un número real
	 * @param a El número real para calcular su inverso aditivo
	 * @return El inverso aditivo del número real
	 */
	public float inversoReal(float a) {
		return a - (a * 2);
	}

	/**
	 * Calcula la raíz cuadrada de un número
	 * @param a El número para calcular su raíz cuadrada
	 * @return La raíz cuadrada del número
	 */

