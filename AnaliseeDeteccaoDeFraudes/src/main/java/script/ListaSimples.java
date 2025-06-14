package script;

public class ListaSimples<T> {
    private No<T> inicio;
    private int tamanho;

    public No<T> getInicio() {
        return inicio;
    }
    
    public void adicionar(T dado) {
        No<T> novoNo = new No<>(dado);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
    }
    
    public T get(int indice) {
    if (indice < 0 || indice >= tamanho) {
        throw new IndexOutOfBoundsException("Índice inválido: " + indice);
    }
    No<T> atual = inicio;
    for (int i = 0; i < indice; i++) {
        atual = atual.proximo;
    }
    return atual.dado;
}
    
    public int tamanho() {
        return tamanho;
    }
}

