
public class ColiAssure extends Coli {
	private float FraisAssurance;
	public ColiAssure(float poids, char methodeExp) {
		super(poids, methodeExp);
	}
	
	public float getFraisAssurance() {
		return FraisAssurance;
	}
	public void setFraisAssurance(float fraisAssurance) {
		FraisAssurance = fraisAssurance;
	}
	
	public float calculerFraisAssurance(float FraisAssurance) {
		if (calculerFrais(getPoids(), getMethodeExp() ) < 10.0) {
			return FraisAssurance = (float) (calculerFrais(getPoids(), getMethodeExp() )+3.45);
		}
		else if (10.1 <calculerFrais(getPoids(), getMethodeExp() ) && calculerFrais(getPoids(), getMethodeExp() ) < 30.0) {
			return FraisAssurance = (float) (calculerFrais(getPoids(), getMethodeExp() )+4.95);
		}
		else if (30.1 <calculerFrais(getPoids(), getMethodeExp() )) {
			return FraisAssurance = (float) (calculerFrais(getPoids(), getMethodeExp() )+6.55);
		}
		return FraisAssurance;
		
	}

	@Override
	public String toString() {
		return "ColiAssure [ Frais d'assurance ajouté le nouveau frais est egale  =" + FraisAssurance + "]";
	}
	
	

}
