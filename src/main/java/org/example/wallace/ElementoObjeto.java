package org.example.wallace;

public class ElementoObjeto extends Elemento {
    public void aceitar(VisitanteElemento visitante) {
        visitante.visitar(this);
    }
}
