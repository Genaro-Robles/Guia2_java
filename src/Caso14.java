import java.util.Scanner;
public class Caso14 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Carrera: [DS-RC-DG] ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno: [M-T-N]");
		String turno = sc.nextLine();
		
		float monto = 0, descuento = 0;
		
		switch (carrera) {
		
		case "DS":
			monto = 1500;
			carrera = "Desarrollo de Software";
			break;
		case "RC":
			monto = 1400;
			carrera = "Redes y Conectividad";
			break;
		case "DG":
			monto = 1300;
			carrera = "Diseño Grafico";
			break;
		default:
			monto = 0;
		}
		
		switch (turno) {
		
		case "M":
			descuento = monto*0.1f;
			turno = "Mañana";
			break;
		case "T":
			descuento = monto*0.2f;
			turno = "Tarde";
			break;
		case "N":
			descuento = monto*0.15f;
			turno = "Noche";
			break;
		default:
			monto = 0;
		}
		float TA = monto - descuento;
		float TAD = TA/3.33f;
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Alumno: "+alumno);
		System.out.println("Carrera: "+carrera);
		System.out.println("Turno: "+turno);
		System.out.println("Monto: "+monto);
		System.out.println("Descuento: "+descuento);
		System.out.println("Total a pagar: "+TA);
		System.out.println("Total a pagar (Dolares): "+TAD);
	}
	}