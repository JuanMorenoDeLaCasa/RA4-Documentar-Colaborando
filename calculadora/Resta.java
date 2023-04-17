package calculadora;
/**
 * Clase Resta - Clase para realizar operaciones de resta.¡
 * @version 0.0.1
 * @author Pedro
 */
public class Resta {

	/**
	 * Variable para almacenar el valor acumulado
	 */
	public float valorAcumulado;

	/**
	 * Devuelve el valor acumulado actual
	 *
	 * @return El valor acumulado
	 */
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	/**
	 * Establece el valor acumulado
	 * @param valorAcumulado El valor acumulado actual
	 */
	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}

	/**
	 * Resta dos números reales y devuelve el resultado
	 *
	 * @param a El primer número real
	 * @param b El segundo número real
	 * @return La resta de los dos números reales
	 */
	public float dosReales(float a, float b) {
		return a-b;
	}

	/**
	 * Resta dos números enteros y devuelve el resultado
	 * @param a El primer nuero entero
	 * @param b El segundo numero entero
	 * @return La resta de los dos números enteros
	 */
	public int dosEnteros(int a, int b) {
		return a-b;
	}

	/**
	 * Resta tres números reales y devuelve el resultado.
	 *
	 * @param a El primer numero real
	 * @param b El segundo numero real
	 * @param c El tercer numero real
	 * @return La resta de los tres números reales
	 */
	public float tresReales(float a, float b, float c) {
		return a-b-c;
	}

	/**
	 * Resta un numero real al valor acumulado y devuelve el resultado
	 *
	 * @param a El número real a restar
	 * @return El valor acumulado despues de la resta
	 */
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}

