package ds2023;

public class Fleur extends Plante {
	private String couleur;
    private int moisF;
    
    public Fleur(String nom, double hauteur, int age, double prix, String couleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }
    
    
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }
    
    
    @Override
    public void description() {
        System.out.println("Nom : " + nom + " : Hauteur : " + hauteur + " cm : Âge : " + age +
                           " Prix : " + prix + " dinars Couleur : " + couleur);
        fleurir();
    }
    
    public void fleurir() {
        if (moisF == 4 || moisF == 5 || moisF == 6)
            System.out.println("La fleur est en fleurs.");
        else
            System.out.println("La fleur n'est pas en fleurs.");
    }

}
