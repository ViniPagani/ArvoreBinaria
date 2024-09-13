public class Arvore {
    Node raiz = null;

    void insert(int valor, Node posicao){
        if (posicao == null){
            raiz = new Node(valor);
        }
        else if (valor < posicao.valor){
            if (posicao.esquerda == null){
                posicao.esquerda = new Node(valor);
            }
            else {
                insert(valor, posicao.esquerda);
            }
        }
        else if (valor > posicao.valor){
            if (posicao.direita == null){
                posicao.direita = new Node(valor);
            }
            else{
                insert(valor, posicao.direita);
            }
        }
    }

    void preOrdem(Node posicao){
        System.out.print(" " + posicao.valor);
        if (posicao.esquerda != null){
            preOrdem(posicao.esquerda);
        }
        if (posicao.direita != null){
            preOrdem(posicao.direita);
        }
    }

    void inOrdem(Node posicao){
        if (posicao.esquerda != null){
            inOrdem(posicao.esquerda);
        }
        System.out.print(" " + posicao.valor);
        if (posicao.direita != null){
            inOrdem(posicao.direita);
        }
    }

    void posOrdem(Node posicao){
        if (posicao.esquerda != null){
            posOrdem(posicao.esquerda);
        }
        if (posicao.direita != null){
            posOrdem(posicao.direita);
        }
        System.out.print(" " + posicao.valor);
    }
}
