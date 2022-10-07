package cuerposgeometricos;

public class hexaedro {

	public static void main(String[] args) {
		float a;
		double Area, Volumen, D;
		
		//Datos de entrada
		a = 9;
		Area = (Math.pow(a, 2) * Math.sqrt(3));
		Volumen= Math.pow(a, 3);
		D= a * Math.sqrt(3);
		
		//Resultados
		System.out.println("Datos del Hexaedro :");
		System.out.println("1.Valor de las arsitas :"  +a);
		System.out.println("2.Area :"  + String.format("%.2f", Area));
		System.out.println("3.Volumen :"  + String.format("%.2f", Volumen));
        System.out.println("4.Longitud de sus vertices :"  + String.format("%.2f", D));

	}

}
