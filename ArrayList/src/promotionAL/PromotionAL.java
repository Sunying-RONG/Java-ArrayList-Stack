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
	  if (listeEtudiants.isEmpty()) { // Stack méthode empty(), return true s'il n'y a pas d'élément.
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
    
    public EtudiantAL checkLastEtudiant() {
    	return listeEtudiants.get(nbEtudiants() - 1);
    }
    
    public EtudiantAL deleteLastEtudiant() {
    	return listeEtudiants.remove(nbEtudiants() - 1);
    }
    
    public int checkPositionToLast(EtudiantAL e) {
    	return nbEtudiants() - listeEtudiants.indexOf(e);
    }
 
}

