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
