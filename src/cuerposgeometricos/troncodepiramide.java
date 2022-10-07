package cuerposgeometricos;

public class troncodepiramide {

	public static void main(String[] args) {
		float L1, l2, l3,   B1, b2, Pbase1, Pbase2;
		double Apotema,  Abase1, Abase2, A, AreaLateral,  AreaTotal, Volumen;
		
		//Datos de entrada
		
		A = 30;
		L1 = 24;
		l2 = 10;
		l3 = L1 / 2 - l2 / 2;
		Apotema = Math.sqrt(Math.pow(L1, 2) + Math.pow(l3, 2));
		B1 = L1;
		b2 = l2;
		Pbase1 = B1;
		Pbase2 = b2;
		Abase1 = Math.pow(L1, 2);
		Abase2 = Math.pow(l2, 2);
		AreaLateral = (Pbase1 + Pbase2) / 2 * (Apotema);
       AreaTotal = AreaLateral + Abase1 + Abase2;
       Volumen = (Abase1 + Abase2 + (Math.sqrt(Abase1 * Abase2))) * A/3;
        //Resultados
       System.out.println("Datos del tronco de piramide :");
       System.out.println("1.Altura :"  + A);
       System.out.println("2.Longitud del Lados Mayor :"  + L1);
       System.out.println("3.Longitud del lado menor :"  + l2);
       System.out.println("4.Apotema :"  + Apotema);
       System.out.println("5.Perimetro de la base Mayor :"  +Pbase1);
       System.out.println("6.Perimetro de la base menor :"  + Pbase2);
       System.out.println("7.Area de la base Mayor :"  + Abase1);
       System.out.println("8.Area de la base menor :"  + Abase2);
       System.out.println("9.Area Lateral :"  + AreaLateral);
       System.out.println("10.Area Total :"  + AreaTotal);  
       System.out.println("11.Volumen :"  + Volumen);

	}

}
