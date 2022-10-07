package cuerposgeometricos;

public class cilindro {

	public static void main(String[] args) {
		
		float r, a;
		double Pbase, Abase, AreaLateral, AreaTotal, Volumen;
		
		a = 8f;
		r = 5f;
		Pbase = 2 *(Math.PI)* r * a;
		Abase = (Math.PI)* (Math.pow(r, 2));
		AreaLateral = Pbase * a;
		AreaTotal = AreaLateral + 2 * Abase;
		Volumen = Abase * a;
		
		//Resultados
		System.out.println("****Datos del cilindro****");
		System.out.println("Area del cilindro: " + a);
		System.out.println("Radio del cilindro: " + r);
		System.out.println("Perimetro del area: " + String.format("%.2f", Pbase));
		System.out.println("Area de la base: " + String.format("%.2f", Abase));
		System.out.println("Area Lateral: " + String.format("%.2f", AreaLateral));
		System.out.println("Area Total: " + String.format("%.2f", AreaTotal));
		System.out.println("Volumen: " + String.format("%.2f", Volumen));
		
	}

}
