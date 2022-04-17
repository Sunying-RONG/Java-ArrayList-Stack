package promotion;

import java.util.Scanner;

public class Etudiant {

	/****************** Partie attributs ****************************************/

	// L'attribut nom de l'étudiant
	private String nom;

	// Vous devez insérer ci-dessous les autres attributs (l'age et les 3 notes)

	private double noteProg, noteSyst, noteStage;
	private int age;

	/***************************************************************************/

	/******************** Partie Constructeurs ***************************/

	// Constructeur par défaut qui ne contient aucun parametre
	public Etudiant() {
	}

	// Constructeur qui contient seulement l'attribut nom
	public Etudiant(String name) {
		this.nom = name;
	}

	// Vous devez ci-dessous définir le constructeur qui initialise tout sauf les
	// notes de l'étudiant
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	// Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age
	// de l'étudiant
	public Etudiant(String nom, double noteProg, double noteSyst, double noteStage) {
		this.nom = nom;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
	}

	// Vous devez ci-dessous définir le constructeur qui initialise tous les
	// attributs

	public Etudiant(String nom, int age, double noteProg, 
									double noteSyst, double noteStage) {
		this.nom = nom;
		this.age = age;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);

	}

	/***********************************************************************/

	/*************************************
	 * Partie Accesseurs
	 ***********************/

	/*
	 * Accesseurs de l'attribut nom : getNom qui retourne la valeur du nom setNom
	 * qui initialise la valeur du nom
	 */

	public String getNom() {
		return this.nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	/* Vous devez ci-dessous créer les accesseurs pour les autres attributs : */

	// Accesseurs de l'age

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Accesseurs des notes
	public double getNoteProg() {
		return this.noteProg;
	}

	public void setNoteProg(double noteProg) {
		if (0 < noteProg && noteProg < 20)
			this.noteProg = noteProg;
		else
			System.out.println("La note doit etre comprise entre 0 et 20");
	}

	public double getNoteSyst() {
		return this.noteSyst;
	}

	public void setNoteSyst(double noteSyst) {
		if (0 < noteSyst && noteSyst < 20)
			this.noteSyst = noteSyst;
		else
			System.out.println("La note doit etre comprise entre 0 et 20");
	}

	public double getNoteStage() {
		return this.noteStage;
	}

	public void setNoteStage(double noteStage) {
		if (0 < noteStage && noteStage < 20)
			this.noteStage = noteStage;
		else
			System.out.println("La note doit etre comprise entre 0 et 20");
	}

	/***********************************************************************************/

	/******************************
	 * Partie méthodes
	 ***************************************/

	/*
	 * Méthode toString() qui permet d'afficher des informations concernant un
	 * étudiant. Méthode à décommenter et à modifier ci-dessous
	 */

	public String toString() {
		return "Etudiant [nom=" + nom + ", noteProg=" + noteProg 
				+ ", noteSyst=" + noteSyst + ", noteStage=" + noteStage
				+ ", age=" + age + "]";
	}

	/* Méthode moyenne à décommenter et à remplir */

	public double moyenne() {
		return (this.noteProg + this.noteSyst + this.noteStage) / 3;
	}
	
}

