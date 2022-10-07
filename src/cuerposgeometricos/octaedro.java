package cuerposgeometricos;

public class octaedro {

	public static void main(String[] args) {
		float a;
		double Area, Volumen;
		
		//Datos de entrada
		a = 14;
		Area= 2 * Math.pow(a, 2) * Math.sqrt(3);
		Volumen= (Math.sqrt(2) / 3) * Math.pow(a, 3);
		
		//Resultados
		System.out.println("Datos del Octaedro :" );
		System.out.println("1.Valor de las aristas :"  + a);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));

	}

}
