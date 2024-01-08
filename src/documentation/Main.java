package documentation;

/**
 *la classe main
 *
 */
public class Main {

	public static void main(String[] args) {
		/**
		 *tableaux t1 avec troix arguments
		 *
		 */
			int[] t1 = { 1,2,3 };
			int[] t2 = { 0,2,1,4 };
			int[] t3 = { 1,4,4,4 };
			Polynome p1 = new Polynome(t1); 
			Polynome p2 = new Polynome(t2); 
			Polynome p3 = new Polynome(t3); 
			
			System.out.println("1er polynome " +p1.toString());
			//System.out.println("Derivee polynome 1 "+ p1.derive());
			System.out.println("\n 2er polynome " +p2.toString());
			//System.out.println("Derivee polynome 2 "+ p2.derive());
			System.out.println("\n 3er polynome " +p3.toString());
			//System.out.println("Derivee polynome 3 "+ p3.derive());
			System.out.println("\n Somme de deux polynomes (p1+p2) "+ p1.addition(p2));
			System.out.println("\n calcul de la valeur d'un polynome pour un reel "+ p1.valeurPoly(2));
			
			
		}
		

}
