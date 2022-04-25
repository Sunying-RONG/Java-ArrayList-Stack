package promotionAL;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

import complexiteSource.Chrono;

public class MainAL {

	public static void main(String[] args) throws IOException {

		/***********************
		 * Constructeurs
		 *******************************************/
		
		EtudiantAL etud1 = new EtudiantAL("Paul", 25, 15, 15, 16);
		EtudiantAL etud2 = new EtudiantAL("Jean", 24, 12, 14, 15);
		EtudiantAL etud3 = new EtudiantAL("Abdoulkhader", 23, 11, 14, 16);
		EtudiantAL etud4 = new EtudiantAL("Astrid", 26, 10, 18, 14);
		EtudiantAL etud5 = new EtudiantAL("Paolo", 27, 15, 16, 17);
		EtudiantAL etud6 = new EtudiantAL("Zoe", 26, 16, 16, 16);
		EtudiantAL etud7 = new EtudiantAL("Anna", 26, 16, 16, 16);
	  
		//Creation d'une nouvelle promotion
		PromotionAL P = new PromotionAL(2019);
		 
		//Inscription des étudiants dans la promotion 2019
	 	P.inscrit(etud1);
	    P.inscrit(etud2);
	    P.inscrit(etud3);
	    P.inscrit(etud4);
	    P.inscrit(etud5);
	    P.inscrit(etud6);
		P.inscrit(etud7);			

//		System.out.println(P.getEtudiant(1));
//		System.out.println(P.moyenneIterator());
//		System.out.println(P.moyenneStream());
//		System.out.println(P.moyenneGenerale());
//		System.out.println("Last "+P.checkLastEtudiant());
//		System.out.println("Delete "+P.deleteLastEtudiant());
//		System.out.println("Last "+P.checkLastEtudiant());
//		System.out.println("Check position from the top(last) "+P.checkPositionToLast(etud5));
		
		//TEST TEMP AJOUT
		
		Chrono chronoAdd=new Chrono("mon chrono");
		P.getListeEtudiants().clear();
			
		for(int essai = 0;essai<1000000;essai++) {
			chronoAdd.start("Temps-Ajout-ArrayList");
			P.getListeEtudiants().add(new EtudiantAL());
			chronoAdd.stop("Temps-Ajout-ArrayList");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps d'ajout sur ArrayList ="+chronoAdd.getResult("Temps-Ajout-ArrayList")/1000000.0+" ms");		
		System.out.println("total ="+chronoAdd.getResult()/1000000.0+" ms");
		System.out.println("");
		
		//Test Temps Search
		Chrono chronoIndexOf=new Chrono("mon chrono3");
				
		for(int essai = 0;essai<1000000;essai++) {
			EtudiantAL etuAL = P.getListeEtudiants().get(essai);
			chronoIndexOf.start("Temps-IndexOf-AL");
			P.getListeEtudiants().indexOf(etuAL);
			chronoIndexOf.stop("Temps-IndexOf-AL");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps Search indexOf sur AL ="+chronoIndexOf.getResult("Temps-IndexOf-AL")/1000000.0+" ms");
		System.out.println("total ="+chronoIndexOf.getResult()/1000000.0+" ms");
		System.out.println("");
		
		//Test Temps Delete
		Chrono chronoDel=new Chrono("mon chrono2");
		
		for(int essai = 0;essai<1000000;essai++) {
			chronoDel.start("Temps-Del-AL");
			P.getListeEtudiants().remove(0);
			chronoDel.stop("Temps-Del-AL");
		}
		System.out.println("chrono nanoTime() et currentTimeMillis()");
		System.out.println("Temps Delete sur AL ="+chronoDel.getResult("Temps-Del-AL")/1000000.0+" ms");
		System.out.println("total ="+chronoDel.getResult()/1000000.0+" ms");
		System.out.println("");
		
		

	}

}

