package org.example.wallace;

public class VisitanteContagem implements VisitanteElemento {
    private int contadorInteiro;
    private int contadorTexto;
    private int contadorObjeto;

    public void visitar(ElementoInteiro elemento) {
        contadorInteiro++;
    }

    public void visitar(ElementoTexto elemento) {
        contadorTexto++;
    }

    public void visitar(ElementoObjeto elemento) {
        contadorObjeto++;
    }

    // Métodos para obter as contagens individuais
    public int getContadorInteiro() {
        return contadorInteiro;
    }

    public int getContadorTexto() {
        return contadorTexto;
    }

    public int getContadorObjeto() {
        return contadorObjeto;
    }
}
