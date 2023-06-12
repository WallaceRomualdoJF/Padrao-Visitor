package org.example.wallace;

public class ElementoInteiro extends Elemento {
    public void aceitar(VisitanteElemento visitante) {
        visitante.visitar(this);
    }
}
