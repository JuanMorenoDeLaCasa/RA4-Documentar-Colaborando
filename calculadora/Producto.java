/**
 * Esta clase  representa una calculadora para realizar operaciones de producto o potencia.
 * @since 1.0
 * @deprecated Esta clase reemplazada la clase Calculadora.
 * @see Calculadora
 * @serial 0.0.1
 * @version 1.0
 * @author Eduardo
 */
package calculadora;


public class Producto {
	/**
	 * Este método toma dos números uno en  coma flotante y el otro devuelve el producto.
	 * @param a Primer número en coma flotante.
	 * @param b Segundo número en coma flotante.
	 * @return Producto de a y b.
	 * @since 1.0
	 */

	
	public float dosReales(float a, float b) {
		return a*b;
	}
	
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
