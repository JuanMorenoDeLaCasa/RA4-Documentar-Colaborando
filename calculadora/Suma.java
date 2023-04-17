
/**

 Este es un código de la clase Suma de la calculadora.
 Esta es la versión 0.0.2
 */
package calculadora;
public class Suma {
/**
 * Atributo para almacenar el valor acumulado de las operaciones de suma.
 */
public float valorAcumulado;

/**
 * Método para obtener el valor acumulado de las operaciones de suma.
 * @return valorAcumulado El valor acumulado de las operaciones de suma.
 */
public float getValorAcumulado() {
		return valorAcumulado;
		}

/**
 * Método para establecer el valor acumulado de las operaciones de suma.
 * @param valorAcumulado El valor acumulado de las operaciones de suma.
 */
public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
		}

/**
 * Método para sumar dos números reales y devolver el resultado.
 * @param a El primer número real.
 * @param b El segundo número real.
 * @return La suma de a y b.
 */
public float dosReales(float a, float b) {
		return a+b;
		}

/**
 * Método para sumar dos números enteros y devolver el resultado.
 * @param a El primer número entero.
 * @param b El segundo número entero.
 * @return La suma de a y b.
 */
public int dosEnteros(int a, int b) {
		return a+b;
		}

/**
 * Método para sumar tres números reales y devolver el resultado.
 * @param a El primer número real.
 * @param b El segundo número real.
 * @param c El tercer número real.
 * @return La suma de a, b y c.
 */
public float tresReales(float a, float b, float c) {
		return a+b+c;
		}

/**
 * Método para sumar un número real al valor acumulado y devolver el resultado.
 * @param a El número real que se va a sumar.
 * @return El nuevo valor acumulado de las operaciones de suma.
 */
public float sumaAcumulado(float a) {
		valorAcumulado = a + valorAcumulado;
		return valorAcumulado;
		}
