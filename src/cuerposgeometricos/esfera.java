package cuerposgeometricos;

public class esfera {

	public static void main(String[] args) {
		float r;
		double Area, Volumen;
		
		// Datos de entrada
		r = 20;
		Area = 4 * (Math.PI * Math.pow(r, 2));
		Volumen =  (Math.PI * Math.pow(r, 3)) * 4 / 3;
		
		// Resultados
		System.out.println("Datos de la esfera :");
		System.out.println("1.Radio :"  + r);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));
	

	}

}
