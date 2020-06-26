import java.util.Scanner;
public class Caso8 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nota: ");
		int nota = sc.nextInt();
		String estado = "";
				
		if (nota <= 20 && nota > 17)
			estado = "Excelente";
		else if (nota > 14)
			estado = "Notable";
		else if (nota > 10)
			estado = "Regular";
		else if (nota > 7)
			estado = "Malo";
		else
			estado = "Sin Palabras";
		
			
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.print(estado);
	}
}