package promotionS;

import java.util.*;



public class PromotionS
{
  /*-------------- attributs ------------------*/

  private Stack<EtudiantS> listeEtudiants;
  private int annee;  
  
  /*-------------- constructeurs ------------------*/

  public PromotionS()
  {
    listeEtudiants = new Stack<EtudiantS>();
    annee = 0;
  }

  public PromotionS(int a)
  {
    listeEtudiants = new Stack<EtudiantS>();
    annee = a;
  }
  
  /*-------------- accesseurs ------------------*/

	public int getAnnee()
	{return annee;}
	
	public void setAnnee(int a)
	{annee=a;}
	
	// Stack hérite les méthodes de Vector, y compris size() et get (int index)
	public EtudiantS getEtudiant(int i)
	{	
		if (i >=0 && i < listeEtudiants.size())
			return (EtudiantS) listeEtudiants.get(i);
		else 
			return null;
	}
	
  /*-------------- méthodes ------------------*/
	// Stack hérite les méthodes de Vector, y compris size()
	public int nbEtudiants()
	{
		return listeEtudiants.size();
	}
	
	// Stack méthodes search(Object o) == -1, n'existe pas
	// Stack méthodes push(E item), ajouter au-dessus de Stack, comme addElement(item). Voir indice, ajouter à la fin.
	public void inscrit (EtudiantS e) {
		if (listeEtudiants.search(e) == -1) {
			listeEtudiants.push(e);
		}
	}

	// itérateur
    public double moyenneIterator() {
	  if (listeEtudiants.empty()) { // Stack méthode empty(), return true s'il n'y a pas d'élément.
		  return 0;
	  }
	  else {
		  double sommeGenerale=0;
		  Iterator iterator = listeEtudiants.iterator();
		  while (iterator.hasNext()) {
			  EtudiantS e = (EtudiantS) iterator.next();
			  sommeGenerale += e.moyenne();
	      }
		  return (sommeGenerale / nbEtudiants());
	  }
    }
  
    // stream
    public double moyenneStream() {
	  if (listeEtudiants.empty()) {
		  return 0;
	  }
	  else {
		  return listeEtudiants
				  .stream()
				  .mapToDouble(e -> e.moyenne())
				  .average()
				  .getAsDouble();
	  }
    }
    
    // Stack méthode peek(), montrer l'objet top de Stack
    public EtudiantS checkLastEtudiant() {
    	return listeEtudiants.peek();
    }
    
    // Stack méthode pop(), supprimer l'objet top de Stack
    public EtudiantS deleteLastEtudiant() {
    	return listeEtudiants.pop();
    }
    
    // Stack méthode search(), return position from the top of the stack where the object is located; the return value -1 indicates that the object is not on the stack.
    public int checkPositionToLast(EtudiantS e) {
    	return listeEtudiants.search(e);
    }
}

