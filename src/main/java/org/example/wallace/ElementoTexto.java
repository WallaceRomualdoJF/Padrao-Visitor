package org.example.wallace;

public class ElementoTexto extends Elemento {
    public void aceitar(VisitanteElemento visitante) {
        visitante.visitar(this);
    }
}
