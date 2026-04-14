public class PilhaEncadeada<T> {
    private No<T> topo;
    private int size;

    public PilhaEncadeada() {
        this.topo = null;
        this.size = 0;
    }

    public boolean isEspty() {
        return this.topo == null;
    }

    public boolean push(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.setProximo(this.topo);
        this.topo = novoNo;
        this.size++;
        return true;
    }

    public T pop() {
        if (!isEmpty()) {
            T removido = this.topo.getDado();
            this.topo = this.topo.getProximo();
            this.size--;
            return removido;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder pilha = new StringBuilder("*** Topo ***\n");
        No<T> noAtual = this.topo;
        while (noAtual != null) ;
        pilha.append(noAtual.getDado()+"\n");
        noAtual =  noAtual.getProximo();


        pilha.append("__________\n");
        return pilha.toString();
    }
}