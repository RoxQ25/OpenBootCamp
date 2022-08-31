public class MainBucleSwitch {

    public static void main(String[] args) {
    var estacion = "primavera";

        switch (estacion) {
            case "verano" -> System.out.println("es verano");
            case "invierno" -> System.out.println("estamos en invierno");
            case "primavera" -> System.out.println("ya es primavera");
            case "otoño" -> System.out.println("ha llegado el otoño");
            default -> System.out.println("no es ninguna estación");
        }
    }
}