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
        this.indice++;
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

    public Ciclabile() {
        this.elenco = new int[0];
    }

    public void addElemento(int elemento) {

        int[] elencoNuovo = new int[this.elenco.length + 1];

        for (int i = 0; i < this.elenco.length; i++) {
            elencoNuovo[i] = this.elenco[i];
        }

        elencoNuovo[this.elenco.length] = elemento;

        this.elenco = elencoNuovo;

    }
}
