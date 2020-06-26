import java.util.Scanner;
public class Caso1 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("edad: ");
		int n = sc.nextInt();
		
		if (n>=18)
			System.out.println("Mayor de edad ");
		else
			System.out.println("Menor de edad");

	}
}
