public class Main {

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int resultado = suma(15, 30, 45);
        System.out.println(resultado);

        Coche micoche = new Coche();
        micoche.anadirPuertas();
        System.out.println(micoche.puertas);
    }

}

class Coche {
    public int puertas = 4;

    public void anadirPuertas() {
        this.puertas++;
    }

}