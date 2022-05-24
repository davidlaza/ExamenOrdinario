public class Utilidad implements interfac {

	/**
	 * Es el parametro que se le introduce para que te diga cual es su factorial
	 * @param a INT
	 * @return Devuelve el valor factorial del parametro introducid
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * Es el parametro que se le mete para ver si es factorial de alguno
	 * @param n INT
	 * @return Devuelve el factorial del valor introducido menos uno
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	
	@Override
	/**
	 * Este metodo te dice si el numero es factorial o no, en caso de no serlo te dice si es primo o no
	 */
	public boolean refactorizacionD(RefactorizacionDParameter parameterObject) {
		// Calculo único
		int c = parameterObject.a + parameterObject.b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = extracted(d);
		
		boolean resultado = !esPrimo;
		return (resultado);
	}

	/**
	 * Este metodo te dice si el valor que le hemos introducido es un numero primo o no
	 * @param d INT
	 * @return Devuelve el resultado de la resta para saber si es primo o no
	 */
	private boolean extracted(int d) {
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	
}