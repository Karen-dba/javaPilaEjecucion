package javaPilaEjecucion;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		}catch(MiException me) {
			me.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}
	
	public static void metodo2() {
		//System.out.println("Inicio metodo2");
		//ArithmeticException ae = new ArithmeticException();
		//en vez de eso es mejor solo llamar el objeto
		//throw new MiException("mi excepcion fue lanzada");
		//System.out.println("Fin metodo2");
		metodo2();
		
	}
	
	
}
