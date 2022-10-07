package cuerposgeometricos;

public class icosaedro {

	public static void main(String[] args) {
		float a;
		double Area, Volumen;
		
		
		//Datos de entrada
		a= 25;
		Area= 5 * Math.pow(a, 2) * Math.sqrt(3);
		Volumen= (3 + Math.sqrt(5) * Math.pow(a, 3) *  5 / 12);
		
		//Resultados
		System.out.println("Datos del Icosaedro :");
		System.out.println("1.Valor de las aristas :"  + a);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));

	}

}
