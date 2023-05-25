package ed;

/**
 * @author Carlos
 */
public class Persona {

	String nombre;
	int edad;

	

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	/**
	 * @param Metodo datosPersona en el que le pasamos
	 * una persona: nombre y edad
	 */
	public  void datosPersona(Persona persona) {
		System.out.println("Nombre: " + persona.nombre + "\nedad: " + persona.edad);
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
	}

}
