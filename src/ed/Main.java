package ed;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona("Rubén",19);

		
		persona.datosPersona(persona);
		
		System.out.println(BloqueUno.devolverNumeroAleatorio(10, 20));
	}

}
