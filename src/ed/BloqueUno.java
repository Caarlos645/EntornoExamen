package ed;

/**
 * @author Carlos
 */
public  class BloqueUno {

	
	/**
	 * @param metodo devolverNumeroAleatorio por el que pasamos dos numeros para 
	 * que haga un math random de estos dos
	 * */
	public static int devolverNumeroAleatorio(int numeroUno, int numeroDos) {
		int numero = (int) (Math.random() * (numeroUno - numeroDos + 1) + numeroDos);
		return numero;
		/**
		 * @return retorna el numero aleatorio
		 * */
	}

}
