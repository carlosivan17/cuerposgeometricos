package cuerposgeometricos;

public class tetraedro {

	public static void main(String[] args) {
		 double a, Area, H, Volumen;
		 
		 //Datos de entrada
		 a = 7;
		 Area = (Math.pow(a, 2) * Math.sqrt(3));
		 H= a * (Math.sqrt(6) / 3);
		 Volumen= (Math.sqrt(2)/ 12) * Math.pow(a, 3);
		 
		 //Resultados
		 System.out.println("Datos del Tetraedro :");
		 System.out.println("1. Valor de las aristas :" + a);
	     System.out.println("2. Area :"  + String.format("%.2f", Area));
	     System.out.println("3. Altura :"  + String.format("%.2f", H));
	     System.out.println("4.Volumen :"  + String.format("%.2f",Volumen));

	}

}
