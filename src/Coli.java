public class Coli {

	private float poids;
	private char methodeExp ;
	public Coli(float poids, char methodeExp) {
		super();
		this.poids = poids;
		this.methodeExp = methodeExp;
		
	}
	
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public char getMethodeExp() {
		return methodeExp;
	}
	public void setMethodeExp(char methodeExp) {
		this.methodeExp = methodeExp;
	}


	
	public static  float calculerFrais(float poids, char methodeExp){
		if(1 < poids && poids < 10 && methodeExp == 'A') {
			return 	(float) (poids * 21.0);
		}
		else if (1 < poids && poids < 10 && methodeExp == 'T') {
			return (float) (poids * 13.5);
		}
		else if (1 < poids && poids < 10 && methodeExp == 'E') {
			return (float) (poids * 6.0);

		}
		else if (11 < poids && poids < 20 && methodeExp == 'A') {
			return (float) (poids * 31.0);
		}
		else if (11 < poids && poids < 20 && methodeExp == 'T') {
			return (float) (poids * 24.5);
		}
		else if (11 < poids && poids < 20 && methodeExp == 'E') {
			return (float) (poids * 16.0);
		}
		else if (poids > 20 && methodeExp == 'A') {
			return (float) (poids * 46.0);
		}
		else if (poids > 20 && methodeExp == 'T') {
			return (float) (poids * 28.5);
		}
		else if (poids > 20 && methodeExp == 'E') {
			return (float) (poids * 21.0);
		}
		return methodeExp;
		}
	

	
	public static void affiche(float poids, char methodeExp){
		System.out.println("poids = "+poids);
		System.out.println("méthode d’expédition = "+methodeExp);
		System.out.println("Frais d’expédition = "+calculerFrais(poids, methodeExp));
	}

	}
	
		

