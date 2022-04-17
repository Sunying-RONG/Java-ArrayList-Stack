package promotionAL;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

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

		System.out.println(P.getEtudiant(1));
		System.out.println(P.moyenneIterator());
		System.out.println(P.moyenneStream());
		System.out.println(P.moyenneGenerale());
		System.out.println("Last "+P.checkLastEtudiant());
		System.out.println("Delete "+P.deleteLastEtudiant());
		System.out.println("Last "+P.checkLastEtudiant());
		System.out.println("Check position from the top(last) "+P.checkPositionToLast(etud5));

	}

}

