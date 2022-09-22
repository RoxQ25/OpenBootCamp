import java.util.Scanner;

public class Main {

	public static double calcularIVA(double precio) {
		double IVA;
		IVA = precio * 0.21;
		return IVA;
	}

	public static void main(String[] args) {
		//programa para calcular el precio de la compra con el iva incluido

		Scanner lector = new Scanner(System.in);

		double precioDeLaCompra, IVA;

		System.out.println("ingrese el precio de la compra");
		precioDeLaCompra = lector.nextDouble();

		IVA = calcularIVA(precioDeLaCompra);

		System.out.println("El precio total sin iba es de: " + precioDeLaCompra);
		System.out.println("El precio total a pagar (IVA incluido) es de: " + (precioDeLaCompra + IVA));
	}
}