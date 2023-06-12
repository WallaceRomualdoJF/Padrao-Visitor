package org.example.wallace;

interface VisitanteElemento {
    void visitar(ElementoInteiro elemento);
    void visitar(ElementoTexto elemento);
    void visitar(ElementoObjeto elemento);
}
