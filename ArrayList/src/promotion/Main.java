package promotion;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		/***********************
		 * Constructeurs
		 *******************************************/
		
		Etudiant etud1 = new Etudiant("Paul", 25, 15, 15, 16);
		Etudiant etud2 = new Etudiant("Jean", 24, 12, 14, 15);
		Etudiant etud3 = new Etudiant("Abdoulkhader", 23, 11, 14, 16);
		Etudiant etud4 = new Etudiant("Astrid", 26, 10, 18, 14);
		Etudiant etud5 = new Etudiant("Paolo", 27, 15, 16, 17);
		Etudiant etud6 = new Etudiant("Zoe", 26, 16, 16, 16);
		Etudiant etud7 = new Etudiant("Anna", 26, 16, 16, 16);
	  
		//Creation d'une nouvelle promotion
		Promotion P = new Promotion(2019);
		 
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
	}

}

