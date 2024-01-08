package documentation;
/**
 *cette classe permet de definir un polynome 
 *avec deux attributs (degres et elements), 
 *deux constructeurs et des methodes(addition, derive, valeurPoly)
 * @author    Diambar SENE
 * @author    Dame BA
 * @version   1.0
 * @date      30 janvier 2022
 * @date 12 fevrier 2022 mise a jour a 12h00mn
 *@file     Polynome.java        
 */

public class Polynome {
	private int degres;
	private int[] elements;
	
	/**
	 * cette constructeur prend en parametre un tablaux de type interger
	 * contenant les elements du polynome a construire 
	 * @param  tab int[]
	 */
	
	public Polynome(int[] tab){
		this.degres = tab.length -1 ;
		elements = new int[tab.length];
		for(int i=0; i <= degres; i++) {
			this.elements[i]=tab[i];
		}
	}
	/**
	 * cette constructeur permet de construire un polynome apartir de son degre.
	 * @param degre
	 */
		public Polynome(int degre){
		this.degres = degre ;
		//le tableaux des elements est de taille degre+1
		//si nous avons un tableaux de deg
		elements = new int[degre + 1];
		for(int i=0; i <= degres; i++) {
			this.elements[i]=0;
		}	
	}
		
	/**
	 * cette methode permet de retourner un element a une position donnee en parametre.
	 *@param i
	 */
	public int getElement(int i) {
		int retour;
		//pour rester dans le tableaux...
		if(i < this.elements.length)
			retour = this.elements[i];
		else
			retour = 0;
		return retour;
	}
	/**
	 * cette permet de modifier un element a la position i par x
	 *@param i
	 *@param x
	 */
	public void setElement(int i , int x) {
		//pour rester au niveau du tableau
		if(i < this.elements.length)
			this.elements[i]=x;
		else;  //en dors du tableau
	}
	/**
	 * cette methode permet d'afficher le polynome sous la forme  2+2X+5X^2+2X^3
	 */
	public String toString() {
		//initiale la chaine s au premier element du tableau
		String s = ""+this.elements[0];
		//pour parcourir les elements du polynome
		for(int i = 1; i <= this.degres; i++) 
			//
			if(this.elements[i] > 0)
				s+="+"+this.elements[i]+"X^"+i;
			else
				if((this.elements[i] < 0))
					s+=this.elements[i]+"X^"+i;
		return s;
	}

	
	/**
	 * cette methode prend en argument un polynome et retourne la somme du polynome qui appel la methode et le polynome en passe en parametre
	 * @param p
	 * @return pr
	 */
	public Polynome addition(Polynome p) {
		
		int degreMax = Math.max(p.degres, this.degres);
		Polynome pr  = new Polynome(degreMax);
		for(int i = 0; i <= degreMax; i++)
			pr.setElement(i, this.getElement(i)+p.getElement(i));
		return pr;
	}
	/**
	 * cette methode retourne la derivee de la polynome
	 *@param Polynome p
	 *@return pr
	 */
	public Polynome derive() {
		 //Polynome nouveau = new  Polynome(this.degres - 1);
	      Polynome nouveau = this;
	      for (int i=0; i < this.degres; i++)
	         nouveau.elements[i] = this.elements[i+1]* (i+1);
	      nouveau.degres = this.degres - 1;
	      return nouveau;
	   }
	
	/**
	 * cette methode prend en argument un entier et retourne une valeur
	 *@param integer x
	 *@return result
	 */
	public int valeurPoly(int x) {
	      int result = 0;
	      for (int i = 0 ; i < this.degres ; i++)
	         result += this.elements[i]*Math.pow(x,i);
	      return result;
	   }
	
	

}
