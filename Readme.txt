O sistema de contagem de elementos é projetado para percorrer uma lista de elementos e contar quantos elementos de cada tipo estão presentes na lista. Ele utiliza o padrão Visitor para separar as operações de contagem dos diferentes tipos de elementos em um visitante específico.

1)Elemento: O sistema trabalha com diferentes tipos de elementos, como inteiros, textos e objetos. Cada classe de elemento implementa o método aceitar() da classe Elemento.

2)ElementoInteiro, ElementoObjeto e ElementoTexto: São classes concretas que estendem a classe Elemento. Elas representam diferentes tipos de elementos, como inteiros, textos e objetos.

3)VisitanteContagem: É uma classe concreta que implementa a interface VisitanteElemento e Ela mantém contadores individuais para cada tipo de elemento encontrado.

4)VisitanteElemento: É uma interface que define os métodos visitar() para cada tipo de elemento. Cada método visitar() é responsável por realizar uma operação específica no elemento correspondente.