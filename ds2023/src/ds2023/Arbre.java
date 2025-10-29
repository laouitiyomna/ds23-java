package ds2023;

public class Arbre extends Plante {
	
	private String type_Feuillage;
    static double AbsorMoyenne = 22;

    public Arbre(String nom, double hauteur, int age, double prix, String type_Feuillage) {
        super(nom, hauteur, age, prix);
        this.type_Feuillage = type_Feuillage;
    }
    
    
    public String getType_Feuillage() { return type_Feuillage; }
    

    public double absorptionCO2() {
        if (hauteur > 50) {
            return AbsorMoyenne + 3;}
        return AbsorMoyenne;
    }

    @Override
    public void description() {
        System.out.println("Nom : " + nom + " : Hauteur : " + hauteur + " cm : Âge : " + age +
                           " Prix : " + prix + " dinars Type de feuillage : " + type_Feuillage);
    }
}
