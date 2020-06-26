import java.util.Scanner;
public class Caso6 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Sueldo: ");
		float sueldo = sc.nextFloat();
		float imp;
				
		if (sueldo > 2800)
			imp = 0.05f * sueldo;
		else 
			imp = 0.02f * sueldo;
		
		float total = sueldo - imp;
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Impuesto calculado: "+total);
	}
}