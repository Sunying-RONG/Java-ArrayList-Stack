package promotionS;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

import complexiteSource.Chrono;

public class MainS {

	public static void main(String[] args) throws IOException {

		/***********************
		 * Constructeurs
		 *******************************************/
		
		EtudiantS etud1 = new EtudiantS("Paul", 25, 15, 15, 16);
		EtudiantS etud2 = new EtudiantS("Jean", 24, 12, 14, 15);
		EtudiantS etud3 = new EtudiantS("Abdoulkhader", 23, 11, 14, 16);
		EtudiantS etud4 = new EtudiantS("Astrid", 26, 10, 18, 14);
		EtudiantS etud5 = new EtudiantS("Paolo", 27, 15, 16, 17);
		EtudiantS etud6 = new EtudiantS("Zoe", 26, 16, 16, 16);
		EtudiantS etud7 = new EtudiantS("Anna", 26, 16, 16, 16);
	  
		//Creation d'une nouvelle promotion
		PromotionS P = new PromotionS(2019);
		 
		//Inscription des étudiants dans la promotion 2019
	 	P.inscrit(etud1);
	    P.inscrit(etud2);
	    P.inscrit(etud3);
	    P.inscrit(etud4);
	    P.inscrit(etud5);
	    P.inscrit(etud6);
		P.inscrit(etud7);			

		System.out.println("Info de deuxième étudiant, tester get(int index) : "+P.getEtudiant(1));
		System.out.println("Calcule note moyenne utilisant iterator : "+P.moyenneIterator());
		System.out.println("Calcule note moyenne utilisant stream : "+P.moyenneStream());
		System.out.println("Info du dernier étudiant utilisant peek() : "+P.checkLastEtudiant());
		System.out.println("Supprimer le dernier étudiant et le retourner utilisant pop() : "+P.deleteLastEtudiant());
		System.out.println("Retourner la position du 5ème élément relative au top(le dernier élement, 1 pour le dernier) utilisant search(Objet o) :"+P.checkPositionToLast(etud5));
		System.out.println("Nombre total des éléments dans la liste : "+P.nbEtudiants());
		System.out.println("");
		
		//TEST TEMP AJOUT
		Chrono chronoAdd=new Chrono("mon chrono");
		P.getListeEtudiants().clear();
			
		for(int essai = 0;essai<1000000;essai++) {
			chronoAdd.start("Temps-Ajout-Stack");
			P.getListeEtudiants().push(new EtudiantS());
			chronoAdd.stop("Temps-Ajout-Stack");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps d'ajout sur Stack ="+chronoAdd.getResult("Temps-Ajout-Stack")/1000000.0+" ms");
		System.out.println("total ="+chronoAdd.getResult()/1000000.0+" ms");
		System.out.println("");
		
		//Test Temps Peek
		Chrono chronoPeek=new Chrono("mon chrono4");
				
		for(int essai = 0;essai<1000000;essai++) {
			chronoPeek.start("Temps-Peek-Stack");
			P.getListeEtudiants().peek();
			chronoPeek.stop("Temps-Peek-Stack");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps Peek sur Stack ="+chronoPeek.getResult("Temps-Peek-Stack")/1000000.0+" ms");
		System.out.println("total ="+chronoPeek.getResult()/1000000.0+" ms");
		System.out.println("");
				
		//Test Temps Search
		Chrono chronoSearch=new Chrono("mon chrono3");
				
		for(int essai = 0;essai<1000000;essai++) {
			EtudiantS etuS = P.getListeEtudiants().get(essai);
			chronoSearch.start("Temps-Search-Stack");
			P.getListeEtudiants().indexOf(etuS);
			chronoSearch.stop("Temps-Search-Stack");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps Search sur Stack ="+chronoSearch.getResult("Temps-Search-Stack")/1000000.0+" ms");
		System.out.println("total ="+chronoSearch.getResult()/1000000.0+" ms");
		System.out.println("");
		
		//Test Temps Delete
		Chrono chronoDel=new Chrono("mon chrono2");
		
		while (! P.getListeEtudiants().empty()) {
			chronoDel.start("Temps-Del-Stack");
			P.getListeEtudiants().pop();
			chronoDel.stop("Temps-Del-Stack");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps Delete sur Stack ="+chronoDel.getResult("Temps-Del-Stack")/1000000.0+" ms");
		System.out.println("total ="+chronoDel.getResult()/1000000.0+" ms");
		System.out.println("");

	}

}

