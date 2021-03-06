package promotionAL;

import java.util.*;

public class PromotionAL
{
  /*-------------- attributs ------------------*/

  private ArrayList<EtudiantAL> listeEtudiants;
  private int annee;  
  
  /*-------------- constructeurs ------------------*/

  public PromotionAL()
  {
    listeEtudiants = new ArrayList<EtudiantAL>();
    annee = 0;
  }

  public PromotionAL(int a)
  {
    listeEtudiants = new ArrayList<EtudiantAL>();
    annee = a;
  }

  
  /*-------------- accesseurs ------------------*/

	public int getAnnee()
	{return annee;}
	
	public void setAnnee(int a)
	{annee=a;}
	
	public ArrayList<EtudiantAL> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(ArrayList<EtudiantAL> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	// ArrayList méthodes size(), get()
	public EtudiantAL getEtudiant(int i)
	{	
		if (i >=0 && i < listeEtudiants.size())
			return listeEtudiants.get(i);
		else 
			return null;
	}
	
  /*-------------- méthodes ------------------*/
	
	// ArrayList méthodes size()
	public int nbEtudiants()
	{
		return listeEtudiants.size();
	}
	
	// ArrayList méthodes contains(), return true if contains
	// ArrayList méthodes add(E e), ajouter élément à la fin de liste
	public void inscrit(EtudiantAL e)
	{
		if (! listeEtudiants.contains(e))
	    listeEtudiants.add(e);
	}
	
	// itérateur
    public double moyenneIterator() {
	  if (listeEtudiants.isEmpty()) { // égale à la méthode empty() de Stack, return true s'il n'y a pas d'élément.
		  return 0;
	  }
	  else {
		  double sommeGenerale=0;
		  Iterator iterator = listeEtudiants.iterator();
		  while (iterator.hasNext()) {
			  EtudiantAL e = (EtudiantAL) iterator.next();
			  sommeGenerale += e.moyenne();
	      }
		  return (sommeGenerale / nbEtudiants());
	  }
    }
    
    // stream
    public double moyenneStream() {
	  if (listeEtudiants.isEmpty()) {
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

    public double moyenneGenerale()
    {
	  if (nbEtudiants()==0)
		  return 0;
	  else
	  {
		  int i; 
		  double sommeGenerale=0;
		  for (i=0; i<nbEtudiants(); i++)
			  sommeGenerale = sommeGenerale + this.getEtudiant(i).moyenne();
		  return (sommeGenerale / nbEtudiants());
	  }
    }
    
    // la même effet de la méthode peek() de Stack
    public EtudiantAL checkLastEtudiant() {
    	return listeEtudiants.get(nbEtudiants() - 1);
    }
    
    // la même effet de la méthode pop() de Stack
    public EtudiantAL deleteLastEtudiant() {
    	return listeEtudiants.remove(nbEtudiants() - 1);
    }
    
    // retourner le même chiffre que la méthode search()
    public int checkPositionToLast(EtudiantAL e) {
    	if (listeEtudiants.indexOf(e) != -1) {
    		return nbEtudiants() - listeEtudiants.indexOf(e);
    	} else {
    		return -1;
    	}
    	
    }
 
}

