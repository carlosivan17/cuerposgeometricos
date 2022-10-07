package cuerposgeometricos;

public class piramide {

	public static void main(String[] args) {
		float a, l;
		double Hcuadrada, Apotemacuadrada;
		double AP, Apotema, Pbase, Abase, AreaLateral, AreaTotal, Volumen;
		//procedimiento
		a = 10;
		l = 15;
		Apotema = l/2;
		Hcuadrada= Math.pow(a,2);
		Apotemacuadrada = Math.pow(Apotema, 2);
		Apotema = l/2;
		AP = Math.sqrt(Hcuadrada + Apotemacuadrada);
		Abase = l * l;
		Pbase = l;
		AreaLateral =  ((l * AP) / 2) * 4;
		AreaTotal = AreaLateral + Abase;
		Volumen = (Abase * a) / 3;
		//resultados
		System.out.println("Datos de la piramide ;");
		System.out.println("1.Altura : "  + a);
		System.out.println("2.Longitud de sus lados :"  + l);
		System.out.println("3.Apotema :"  + Apotema);
		System.out.println("4.AP :"  + AP);
		System.out.println("5.Area de la base :"  + Abase);
		System.out.println("6.Perimetro de la base :"  + Pbase);
		System.out.println("7.Area Lateral :"  + AreaLateral);
		System.out.println("8.Area Total :"  + AreaTotal);
		System.out.println("9.Volumen :"  + Volumen);

	}

}
