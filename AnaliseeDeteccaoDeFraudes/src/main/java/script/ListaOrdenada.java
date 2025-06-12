package script;

public class ListaOrdenada<T extends Comparable<T>> {
    private No<T> inicio;
    private int tamanho;

    private static class No<T> {
        T valor;
        No<T> proximo;

        No(T valor) {
            this.valor = valor;
        }
    }

    public void adicionar(T valor) {
        No<T> novo = new No<>(valor);

        if (inicio == null || valor.compareTo(inicio.valor) < 0) {
            novo.proximo = inicio;
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null && valor.compareTo(atual.proximo.valor) >= 0) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }
        tamanho++;
    }

    public T get(int indice) {
        if (indice < 0 || indice >= tamanho) throw new IndexOutOfBoundsException();
        No<T> atual = inicio;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    public int tamanho() {
        return tamanho;
    }
}
