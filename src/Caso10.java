import java.util.Scanner;
public class Caso10 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Empleado: ");
		String empleado = sc.nextLine();
		
		System.out.print("Horas trabajadas: ");
		int ht = sc.nextInt();
		
		System.out.print("Tarifa por hora: ");
		int th = sc.nextInt();
		
		System.out.print("Minutos de tardanza: ");
		float mt = sc.nextFloat();
		
		float Importe = ht * th;
		float Bono;
		float Descuento;
		float Alcanzado = ht*100/70;
						
		if (ht>60)
			Bono = Importe * 0.13f;
		else
			Bono = Importe * 0.04f;
		
		if (mt>15)
			Descuento = Importe * 0.03f;
		else
			Descuento = 0;
		
		float Total = Importe + Bono - Descuento;
			
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Trabajador: "+empleado);
		System.out.println("Horas trabajadas: "+ht);
		System.out.println("Tarifa por horas: "+th);
		System.out.println("Importe: "+Importe);
		System.out.println("Bono: "+Bono);
		System.out.println("Descuento: "+Descuento);
		System.out.println("Meta alcanzada: "+Alcanzado+"%");
	}
}