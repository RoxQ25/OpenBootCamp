public class Main {
	public static void main(String[] args) {

        Persona persona = new Persona();
		persona.setEdad(70);

		System.out.println(persona.getEdad());

		persona.setNombre("Ricardo");

		System.out.println(persona.getNombre());

		persona.setTelefono("678909213");

		System.out.println(persona.getTelefono());
	}
}

class Persona {
	private int edad;

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}

	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	private String telefono;

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return this.telefono;
	}
}
