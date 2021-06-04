/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of EmpresAgricola.
 * 
 * @author emman
 */
public class EmpresAgricola {

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property extencion.
	 */
	private float extencion = 0F;

	/**
	 * Description of the property tiempoCosecha.
	 */
	private String tiempoCosecha = "";

	/**
	 * Description of the property cantCosechaxtiempo .
	 */
	private float cantCosechaxtiempo = 0F;

	/**
	 * Description of the property costoPromedio.
	 */
	private float costoPromedio = 0F;

	/**
	 * Description of the property precioVentaProm.
	 */
	private float precioVentaProm = 0F;

	// Start of user code (user defined attributes for EmpresAgricola)

	// End of user code

	/**
	 * The constructor.
	 */
	public EmpresAgricola() {
		// Start of user code constructor for EmpresAgricola)
		super();
		// End of user code
	}
	
	public EmpresAgricola(String nombre, float extencion, String tiempoCosecha, float cantCosechaxtiempo,
			float costoPromedio, float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extencion = extencion;
		this.tiempoCosecha = tiempoCosecha;
		this.cantCosechaxtiempo = cantCosechaxtiempo;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
	}
	
	/**
	 * Description of the method agregarPeriodo .
	 * @param  periodo 
	 * @param cantEstimada 
	 */
	public void agregarPeriodo(String periodo, float cantEstimada) {
		// Start of user code for method agregarPeriodo 
		// End of user code
	}

	/**
	 * Description of the method eliminarPeriodo.
	 * @param i 
	 * @return 
	 */
	public boolean eliminarPeriodo(int i) {
		// Start of user code for method eliminarPeriodo
		boolean eliminarPeriodo = false;
		return eliminarPeriodo;
		// End of user code
	}

	/**
	 * Description of the method costoPeriodo.
	 * @param i 
	 * @return 
	 */
	public float costoPeriodo(int i) {
		// Start of user code for method costoPeriodo
		float costoPeriodo = 0F;
		return costoPeriodo;
		// End of user code
	}

	/**
	 * Description of the method ganancia.
	 * @param i 
	 * @return 
	 */
	public float ganancia(int i) {
		// Start of user code for method ganancia
		float ganancia = 0F;
		return ganancia;
		// End of user code
	}

	// Start of user code (user defined methods for EmpresAgricola)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns extencion.
	 * @return extencion 
	 */
	public float getExtencion() {
		return this.extencion;
	}

	/**
	 * Sets a value to attribute extencion. 
	 * @param newExtencion 
	 */
	public void setExtencion(float newExtencion) {
		this.extencion = newExtencion;
	}

	/**
	 * Returns tiempoCosecha.
	 * @return tiempoCosecha 
	 */
	public String getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	/**
	 * Sets a value to attribute tiempoCosecha. 
	 * @param newTiempoCosecha 
	 */
	public void setTiempoCosecha(String newTiempoCosecha) {
		this.tiempoCosecha = newTiempoCosecha;
	}

	/**
	 * Returns cantCosechaxtiempo .
	 * @return cantCosechaxtiempo  
	 */
	public float getCantCosechaxtiempo() {
		return this.cantCosechaxtiempo;
	}

	/**
	 * Sets a value to attribute cantCosechaxtiempo . 
	 * @param newCantCosechaxtiempo  
	 */
	public void setCantCosechaxtiempo(float newCantCosechaxtiempo) {
		this.cantCosechaxtiempo = newCantCosechaxtiempo;
	}

	/**
	 * Returns costoPromedio.
	 * @return costoPromedio 
	 */
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	/**
	 * Sets a value to attribute costoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	/**
	 * Returns precioVentaProm.
	 * @return precioVentaProm 
	 */
	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	/**
	 * Sets a value to attribute precioVentaProm. 
	 * @param newPrecioVentaProm 
	 */
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

	@Override
	public String toString() {
		return "EmpresAgricola [nombre=" + nombre + ", extencion=" + extencion + ", tiempoCosecha=" + tiempoCosecha
				+ ", cantCosechaxtiempo=" + cantCosechaxtiempo + ", costoPromedio=" + costoPromedio
				+ ", precioVentaProm=" + precioVentaProm + "]";
	}

}
