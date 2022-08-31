public class Main {
	public static void main(String[] args) {

		Cliente ricardo = new Cliente();
		ricardo.setEdad(70);

		System.out.println(ricardo.getEdad());

		ricardo.setNombre("Ricardo");

		System.out.println(ricardo.getNombre());

		ricardo.setTelefono("678909213");

		System.out.println(ricardo.getTelefono());

		ricardo.setCredito(67000);

		System.out.println(ricardo.getCredito());

		Trabajador trabajador = new Trabajador();
		trabajador.setSalario(935);

	}
}

class Persona {
	private int edad;

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad(){
		return this.edad;
	}

	private String nombre;

	public void setNombre (String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	private String telefono;

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getTelefono(){
		return this.telefono;
	}

}
class Cliente extends Persona{
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona{

	private int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}

