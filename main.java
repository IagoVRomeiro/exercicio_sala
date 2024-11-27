import java.io.*;
public class Main {
	
	public static void main(String[] args) throws Exception{
		
		int[] vetor = {6,3,8,1,4,7,9};
		int[] vetor2 = {13,7,16,4,9,18};
		
		System.out.println("Arvore 1: ");
		Tree tree = new Tree();		
		for(int i = 0; i < vetor.length; i++) {
			tree.inserir(vetor[i]);
		}
		tree.mostrarPreOrdem();
		System.out.println("Quantidade de nos: " + tree.contaNos());
		tree.pesquisa(9);		
		
		System.out.println("Arvore 2: ");
		Tree tree2 = new Tree();			
		for(int i = 0; i < vetor2.length; i++) {
			tree2.inserir(vetor2[i]);
		}		
		tree2.mostrarPreOrdem();				
		System.out.println("Quantidade de nos: " + tree2.contaNos());		
		tree2.pesquisa(3);	
		
		System.out.println("\nArvore 3");
		Tree tree3 = new Tree();		
		tree3.somaNos(tree.raiz, tree2.raiz);
		tree3.mostrarPreOrdem();	
	}
}

class Tree{
	No raiz;
	
	Tree(){
		raiz = null;
	}
	
	void inserir(int x) throws Exception{
		raiz = inserir(x, raiz); 
	}
	
	No inserir(int x, No i) throws Exception{
		/*implemente ou use o que implementou na semana passada*/
	}
	
	void pesquisa(int x) {
		pesquisa(x, raiz);
	}
	
	void pesquisa(int x, No i) {
		/* implemente o método que imprima se o(s) filho(s) do nó caso o valor x, contido no nó, seja encontrado. 
		Se não estiver presente, imprima "Valor X Nao encontrado.". Senão se ambos os filhos forem nulos imprima "No x Nao possui filhos". Se somente o filho da esquerda for nulo imprima "No x Nao possui filho da esquerda.\nFilho da direita: valor".
		Se somente o filho da direita for nulo imprima "No x \nFilho da esquerda: valor \nNao possui filho da Direita.
		Senão imprima "No x \nFilho da esquerda: valor \nFilho da direita: valor".
			}			*/
	}

	
	void remover(int x) throws Exception{
		raiz = remover(x, raiz);
	}
	
	No remover(int x, No i) throws Exception{
		/* implemente */
	}
	
	No maiorEsq(No i, No j){
		/* implemente para fazer a remoção correta */
	}
	
	int getAltura() {
		return getAltura(raiz, 0);
	}
	
	
	int contaNos() {
		return contaNos(raiz);
	}
	
	int contaNos(No i) {
		/* implemente o método para contar os nós */
	}
	
	
	void somaNos(No a1, No a2) throws Exception{		
		/* implemente. Explicação em sala. */
	}
	
	void mostrarInOrdem() {
		mostrarInOrdem(raiz);
	}
	
	void mostrarInOrdem(No i) {
		/* implemente */
	}
	
	void mostrarPreOrdem() {
		mostrarPreOrdem(raiz);
	}
	
	void mostrarPreOrdem(No i) {
		/* implemente */
	}
	
}


class No{
	int num;
	No esq, dir;
	
	No(int num){
		this.num = num;
	}
	
	No getEsq() {
		return esq;
	}
	
	No getDir() {
		return dir;
	}
}