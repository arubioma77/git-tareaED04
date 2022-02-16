package cuentas;

/**
 * Clase para implementar métodos qu eoperan sobre una cuenta bancaria.
 * 
 * @version 1
 * @author Entornos de Desarrollo
 * @see https://fpadistancia.caib.es/pluginfile.php/92352/mod_resource/content/13/ED04_Contenidos_Web/anexo_vii_prctica_javadoc_con_eclipse.html
 */

public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Método constructor de clase CCuenta
	 * 
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Getter
	 * 
	 * @return getSaldo
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * 
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * 
	 * @param cantidad
	 * @throws Exception Devuelve excepción si cantidad a retirar es negativa o
	 *                   menos que estado
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Getter atributo nombre de la clase CCuenta
	 * 
	 * @return
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Setter atributo nombre de la clase CCuenta
	 * 
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter atributo cuenta de la clase CCuenta
	 * 
	 * @param nombre
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Setter atributo cuenta de la clase CCuenta
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Getter atributo saldo de la clase CCuenta
	 * 
	 * @param nombre
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Setter atributo saldo de la clase CCuenta
	 * 
	 * @param cuenta
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Getter atributo TipoInterés de la clase CCuenta
	 * 
	 * @return
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Setter atributo TipoInterés de la clase CCuenta
	 * 
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}