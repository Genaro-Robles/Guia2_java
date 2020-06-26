import java.util.Scanner;
public class Caso13 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Numero 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Numero 2: ");
		float n2 = sc.nextFloat();
				
		System.out.print("Operacion [1-6]: ");
		int ope = sc.nextInt();
		
		float resultado = 0;
		String operacion = "";
				
		switch (ope) {
		
		case 1:
			resultado = n1+n2;
			operacion = "Suma";
			break;
		case 2:
			resultado = n1-n2;
			operacion = "Resta";
			break;
		case 3:
			resultado = n1*n2;
			operacion = "Multiplicacion";
			break;
		case 4:
			if (n2 == 0) {
				resultado = 0;
				operacion = "No es posible hallar la division";
			}else {
				operacion = "Division";
				resultado = n1/n2;
			}
			break;
		case 5:
			if (n2 == 0) {
				resultado = 0;
				operacion = "No es posible hallar el resto entero";
			}else {
				operacion = "Resto";
				resultado = n1%n2;
			}
				
			break;
		case 6:
			resultado = (n1+n2)/2;
			operacion = "Promedio";
			break;
		default:
			resultado = 0;
		}
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Numero 1: "+n1);
		System.out.println("Numero 2: "+n2);
		System.out.println("Operacion: "+operacion);
		System.out.println("Resultado: "+resultado);
	}
	}