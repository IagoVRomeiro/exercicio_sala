
class No {

    int num;
    No direita, esquerda;

    No(int valor) {
        num = valor;
        direita = esquerda = null;
    }
}

class Tree {

    No raiz;

    Tree() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = inserir(valor, raiz);
    }

    No inserir(int valor, No no) throws ex{
        if (no == null) {
            no = new No(valor);
        } else if (valor < no.valor) {
            direita = inserir(valor, direita);
            else if(valor > no.valor){
                esquerda = inserir(valor,esquerda);
            }
            else{
                throw new ex("erro");
            }
        }
    }
}

class Exercicio {

    public static void main(String[] args) {
        Tree arvore = new arvore();
        arvore.inserir(5);
    }
}
