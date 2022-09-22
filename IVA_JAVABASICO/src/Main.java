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

		double PrecioDeLaCompra, IVA;

		System.out.println("ingrese el precio de la compra");
		PrecioDeLaCompra = lector.NextDouble();

		IVA =calcularIVA(PrecioDeLaCompra);

		System.out.println("El precio total sin iba es de: "+PrecioDeLaCompra);
		System.out.println("El precio total a pagar (IVA incluido) es de: "+(PrecioDeLaCompra+IVA));
	}
}