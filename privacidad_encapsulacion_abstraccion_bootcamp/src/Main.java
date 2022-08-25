public class Main {
    public static void main(String[] args) {

       Persona persona = new Persona();
       persona.SetEdad("70");

       System.out.println(persona.getEdad());

       Persona persona1 = new Persona();
       persona.SetNombre("Ricardo");

       System.out.println(persona.getNombre());

        Persona persona2 = new Persona();
        persona.SetTelefono("678909213");

        System.out.println(persona.getTelefono());
    }
}

class   Persona {
    private String edad;

    public void SetEdad (String edad) {
        this.edad = edad;
    }

    public String getEdad(){
        return this.edad;
    }

    private String nombre;

    public void SetNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    private String telefono;

    public void SetTelefono (String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}
