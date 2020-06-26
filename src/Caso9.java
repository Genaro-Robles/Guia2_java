import java.util.Scanner;
public class Caso9 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nombre: ");
		String alumno = sc.nextLine();
		
		System.out.print("Nota 1 [0-20]: ");
		int n1 = sc.nextInt();
		
		System.out.print("Nota 2 [0-20]: ");
		int n2 = sc.nextInt();
		
		System.out.print("Asistencia [0-12]: ");
		int asistencia = sc.nextInt();
		
		String estado = "";
		float promedio;
		float porcentaje;
				
		promedio = n1*0.3f+n2*0.7f;
		porcentaje = asistencia*100/12;
		
		if (promedio >= 13 && porcentaje >= 70)
			estado = "aprobado";
		else
			estado = "desaprobado";
			
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Alumno: "+alumno);
		System.out.println("Promedio: "+promedio);
		System.out.println("% asistencias: "+porcentaje);
		System.out.println("Estado final: "+estado);
	}
}