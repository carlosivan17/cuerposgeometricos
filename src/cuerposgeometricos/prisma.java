package cuerposgeometricos;

public class prisma {

	public static void main(String[] args) {
		int n, a;
		float AreaLateral;
		float Pbase, l;
		double AnguloCentral, Apotema, Abase, AreaTotal, Volumen;
		//Datos de entrada
		a= 10;
		n= 5;
		l = 8.5F;
		//Procedimiento
		Pbase = n * l;
		AreaLateral = Pbase *a;
        AnguloCentral = 360/n * (Math.PI/180);
        Apotema = l/(2*Math.tan(AnguloCentral)/2);
        Abase = (Pbase * Apotema)/2;
        AreaTotal = AreaLateral + 2 * Abase;
        Volumen = Abase * a;
        //Resultados
        System.out.println("Datos del prisma : ");
        System.out.println("1.Cantidad de lados : " + n);
        System.out.println("2.Longitud de lados : " + l);
        System.out.println("3.Altura : " + a);
        System.out.println("4.Perimetro de la base : " + Pbase);
        System.out.println("5.Area de la base : " + String.format("%.2f", Abase));
        System.out.println("6.Apotema : " + String.format("%.2f", Apotema));
        System.out.println("7.Area Lateral : " +  AreaLateral);
        System.out.println("8.Area Total : " + String.format("%.2f", AreaTotal));
        System.out.println("9.Volumen : " + String.format("%.2f", Volumen));

	}

}
