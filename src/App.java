import org.lessons.java.ciclabile.Ciclabile;

public class App {
    public static void main(String[] args) throws Exception {
        Ciclabile pistaCiclabile = new Ciclabile(new int[] { 2, 12, 34, 21, 12, 6 });

        // pistaCiclabile.getElementi();

        System.out.println("Ha elementi? - " + pistaCiclabile.hasAncoraElementi());

        while (pistaCiclabile.hasAncoraElementi()) {
            System.out.println(pistaCiclabile.getElementoSuccessivo());
        }

        System.out.println("Ha elementi? - " + pistaCiclabile.hasAncoraElementi());

    }
}