import java.util.Scanner;

public class BuclesVariableString {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String n = "José";
		while (n.equals("José")) {
			System.out.println("Ingrese su nombre: ");
			String nom = leer.next();
			if (n.equals(nom)) {
				System.out.println("Bienvenido: "+nom);
				break;
			} else{
				System.out.println("no le hemos identificado, vuelva a probar");
			}
		}
	}
}{
}
