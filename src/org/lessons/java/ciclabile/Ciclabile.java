package org.lessons.java.ciclabile;

public class Ciclabile {

    private int[] elenco;
    private int indice = 0;

    public void getElementi() {
        System.out.println("Lunghezza array: " + elenco.length);
        for (int i = 0; i < elenco.length; i++) {
            System.out.println("Indice: " + i + "\n- " + elenco[i]);
        }
    }

    public int getElementoSuccessivo() {
        int elem = elenco[indice];
        indice++;
        return elem;
    }

    public boolean hasAncoraElementi() {
        if (indice > elenco.length - 1) {
            return false;
        }
        return true;
    }

    public int getElementoPerIndice(int indice) {
        System.out.println("All'indice " + indice + " abbiamo il numero " + elenco[indice]);
        return elenco[indice];
    }

    public Ciclabile(int[] elenco) {
        this.elenco = elenco;
    }
}
