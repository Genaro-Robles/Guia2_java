import java.util.Scanner;
public class Caso15 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Cliente: ");
		String cliente = sc.nextLine();
		
		System.out.print("Producto: [TB-LT-MN-IM] ");
		String producto = sc.nextLine();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Forma de pago: [C1-C2]");
		String formapago = sc.nextLine();
		
		float imp = 0, descuento = 0, incremento = 0, TA = 0, precio = 0, mod = 0;
		String formapago1 = "";
		
		switch (producto) {
		
		case "TB":
			precio = 350;
			producto = "Tablet";
			break;
		case "LT":
			precio = 2300;
			producto = "Laptop";
			break;
		case "MN":
			precio = 850;
			producto = "Monitor";
			break;
		case "IM":
			precio = 680;
			producto = "Impresora";
			break;
		default:
			imp = 0;
		}
		imp = precio * cantidad;
		switch (formapago) {
		
		case "C1":
			descuento = imp*0.05f;
			formapago = "Contado";
			formapago1 = "Descuento";
			mod = descuento;
			TA = imp-descuento;
			break;
		case "C2":
			incremento = imp*0.12f;
			formapago = "Crédito";
			formapago1 = "Incremento";
			mod = incremento;
			TA = imp+incremento;
			break;
		default:
			formapago = "Su forma de pago no es valida";
		}
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Cliente: "+cliente);
		System.out.println("Producto: "+producto);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad: "+cantidad);
		System.out.println("Importe: "+imp);
		System.out.println("Forma de pago: "+formapago);
		System.out.println(formapago1+": "+mod);
		System.out.println("Total a pagar: "+TA);
	}
	}