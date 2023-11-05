package controller;

import model.Lista;

public class ControllerReorganiza {

	Lista<Integer>[] ListaB = new Lista[5];

	private int hashCode(int valor) {
		int hash = valor % 5;
		return hash;
	}
	
	public ControllerReorganiza() {
		int tamanho = ListaB.length;
		int i;
		for (i= 0;i<tamanho;i++) {
			ListaB[i] = new Lista<Integer>();
		}
	}

	public void rehash(Lista ListaA) throws Exception {
		int tamanhoL = ListaA.size();
		for (int j = 0; j < tamanhoL; j++) {
			int valor = (int) ListaA.get(j);
			int hash = hashCode(valor);
			if(ListaB[hash].isEmpty()) {
				ListaB[hash].addFirst(valor);
			} else {
				ListaB[hash].addLast(valor);
			}
			
		}
	}
	
	public void list() throws Exception {
		int tamanhoL = ListaB.length;
		for (int i = 0; i < tamanhoL; i++) {
			Lista<Integer> l = ListaB[i];
			int tamanho = l.size();
			System.out.print("Linha " + i + ": ");
			for (int j = 0;j<tamanho;j++) {
				System.out.print(l.get(j)+" -> ");
			}
			System.out.print("NULL\n");
			
		}
	}
}
