import org.example.wallace.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContagemElementosTest {

    @Test
    public void testContagemElementos() {
        // Criação da lista de elementos
        List<Elemento> elementos = new ArrayList<>();
        elementos.add(new ElementoInteiro());
        elementos.add(new ElementoTexto());
        elementos.add(new ElementoObjeto());
        elementos.add(new ElementoInteiro());
        elementos.add(new ElementoTexto());
        elementos.add(new ElementoObjeto());

        // Criação do visitante de contagem
        VisitanteContagem visitanteContagem = new VisitanteContagem();

        // Percorre a lista de elementos e aplica o visitante
        for (Elemento elemento : elementos) {
            elemento.aceitar(visitanteContagem);
        }

        // Obtenção das contagens individuais
        int contadorInteiro = visitanteContagem.getContadorInteiro();
        int contadorTexto = visitanteContagem.getContadorTexto();
        int contadorObjeto = visitanteContagem.getContadorObjeto();

        // Teste das contagens
        Assert.assertEquals(2, contadorInteiro);
        Assert.assertEquals(2, contadorTexto);
        Assert.assertEquals(2, contadorObjeto);
    }
}