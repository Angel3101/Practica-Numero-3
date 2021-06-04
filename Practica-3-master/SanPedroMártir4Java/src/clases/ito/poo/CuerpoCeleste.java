/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author emman
 */
public class CuerpoCeleste {

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property localizaciones.
	 */
	private String localizaciones = "";

	/**
	 * Description of the property composicion.
	 */
	private String composicion = "";

	// Start of user code (user defined attributes for CuerpoCeleste)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}
	public CuerpoCeleste(String nombre, String localizaciones, String composicion) {
		super();
		this.nombre = nombre;
		this.localizaciones = localizaciones;
		this.composicion = composicion;
	}
	
	/**
	 * Description of the method desplazamiento.
	 * @param i 
	 * @param j 
	 * @return 
	 */
	public float desplazamiento(int i, int j) {
		// Start of user code for method desplazamiento
		float desplazamiento = 0F;
		return desplazamiento;
		// End of user code
	}

	// Start of user code (user defined methods for CuerpoCeleste)

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
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public String getLocalizaciones() {
		return this.localizaciones;
	}

	/**
	 * Sets a value to attribute localizaciones. 
	 * @param newLocalizaciones 
	 */
	public void setLocalizaciones(String newLocalizaciones) {
		this.localizaciones = newLocalizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}

	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}
	@Override
	public String toString() {
		return "CuerpoCeleste [nombre=" + nombre + ", localizaciones=" + localizaciones + ", composicion=" + composicion
				+ "]";
	}

}
