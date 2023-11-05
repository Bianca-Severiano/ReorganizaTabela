package view;

import controller.ControllerReorganiza;
import model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		ControllerReorganiza c = new ControllerReorganiza();
		
		Lista<Integer> [] ListaA = new Lista[10];
		
		for (int i= 0; i< ListaA.length; i++) {
			ListaA[i] = new Lista<Integer>();
		}
		
			//primeira posicao
			ListaA[0].addFirst(467);
			ListaA[0].addFirst(136);
			ListaA[0].addFirst(158);
			ListaA[0].addFirst(647);
			ListaA[0].addFirst(12);
			
			//segunda posicao
			ListaA[1].addFirst(551);
			ListaA[1].addFirst(600);
			ListaA[1].addFirst(156);
					
			//terceira posicao
			ListaA[2].addFirst(629);
			ListaA[2].addFirst(933);
			ListaA[2].addFirst(914);
			ListaA[2].addFirst(945);
			ListaA[2].addFirst(882);
			ListaA[2].addFirst(414);
			ListaA[2].addFirst(263);
					
			//quarta posicao
			ListaA[3].addFirst(513);
			ListaA[3].addFirst(194);
			ListaA[3].addFirst(795);
			ListaA[3].addFirst(884);

			//quinta posicao
			ListaA[4].addFirst(979);
			ListaA[4].addFirst(337);
			ListaA[4].addFirst(66);
			ListaA[4].addFirst(847);
			ListaA[4].addFirst(591);

			//sexta posicao

			ListaA[5].addFirst(53);
			ListaA[5].addFirst(768);
			
			//setima posicao

			ListaA[6].addFirst(550);
			ListaA[6].addFirst(339);
			ListaA[6].addFirst(90);
			ListaA[6].addFirst(803);
			ListaA[6].addFirst(114);

			//oitava posicao

			ListaA[7].addFirst(88);
			ListaA[7].addFirst(617);
			ListaA[7].addFirst(99);
			ListaA[7].addFirst(216);
			ListaA[7].addFirst(977);
			ListaA[7].addFirst(574);

			//nona posicao

			ListaA[8].addFirst(206);
			ListaA[8].addFirst(338);
			ListaA[8].addFirst(585);
			ListaA[8].addFirst(939);
			ListaA[8].addFirst(227);
			ListaA[8].addFirst(148);
			ListaA[8].addFirst(142);

			//decima posicao

			ListaA[9].addFirst(844);
			ListaA[9].addFirst(708);
			ListaA[9].addFirst(569);		
			
			
			
			for (int i = 0; i < ListaA.length; i++) {
					c.rehash(ListaA[i]);		
			}
			
			c.list();

		

	}

}
