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
		return a * b;
	}

	/**
	 * Este método toma dos números enteros y además nos  devuelve un producto.
	 * @param a Primer número entero.
	 * @param b Segundo número entero.
	 * @return Producto de a y b.
	 * @since 1.0
	 */
	public int dosEnteros(int a, int b) {
		return a * b;
	}

	/**
	 * Este método  toma tres números en coma flotante y devuelve su producto.
	 * @param a Primer número en coma flotante.
	 * @param b Segundo número en coma flotante.
	 * @param c Tercer número en coma flotante.
	 * @return Producto de a, b,  c.
	 * @since 1.0
	 */
	public float tresReales(float a, float b, float c) {
		return a * b * c;
	}

	/**
	 * Este método  toma dos números en coma flotante y devuelve la potencia de la base elevada al exponente.
	 * @param base Base de la potencia.
	 * @param exponente Exponente de la potencia.
	 * @return resultado de la potencia.
	 * @since 1.0
	 */
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}