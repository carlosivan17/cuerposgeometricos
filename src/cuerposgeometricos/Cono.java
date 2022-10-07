package cuerposgeometricos;

public class Cono {

	public static void main(String[] args) {
		float h, r, d;
		double g, Pbase, Abase, AreaLateral, AreaTotal, Volumen;
		double Hcuadrada, Rcuadrada;
		//Datos de entrada
		h = 10;
		r = 40;
		d = r + r;
		Hcuadrada = Math.pow(h, 2);
		Rcuadrada = Math.pow(r, 2);
		g = Math.sqrt(Hcuadrada + Rcuadrada);
		Pbase = Math.PI * d;
		Abase = Math.PI * (Math.pow(r, 2));
		AreaLateral = Pbase * g / 2;
		AreaTotal = AreaLateral + Abase;
		Volumen = Abase * h / 3;
		
		//Resultados
		System.out.println("Datos del cono :");
		System.out.println("1.Altura :"  + h);
		System.out.println("2.Radio :"  + r);
		System.out.println("3.Generatriz :"  + String.format("%.2f", g));
		System.out.println("4.Perimetro de la base :"  + String.format("%.2f", Pbase));
		System.out.println("5.Area de la base :"  + String.format("%.2f", Abase));
		System.out.println("6.Area Lateral :"  + String.format("%.2f" , AreaLateral));
		System.out.println("7.Area Total :"  + String.format("%.2f" , AreaTotal));
		System.out.println("8.Volumen :"  + String.format("%.2f" , Volumen));

	}

}
