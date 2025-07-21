import org.lessons.java.ciclabile.Ciclabile;

public class App {
    public static void main(String[] args) throws Exception {
        // Ciclabile pistaCiclabile = new Ciclabile(new int[] { 2, 12, 34, 21, 12, 6 });

        // System.out.println("Ha elementi? - " + pistaCiclabile.hasAncoraElementi());

        // while (pistaCiclabile.hasAncoraElementi()) {
        // System.out.println(pistaCiclabile.getElementoSuccessivo());
        // }

        // System.out.println("Ha elementi? - " + pistaCiclabile.hasAncoraElementi());

        Ciclabile pistaDue = new Ciclabile();
        pistaDue.addElemento(2);
        pistaDue.addElemento(15);
        pistaDue.addElemento(16);
        pistaDue.addElemento(12);
        pistaDue.addElemento(154);

        while ((pistaDue.hasAncoraElementi())) {
            System.out.println(pistaDue.getElementoSuccessivo());
        }

    }
}