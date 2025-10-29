package ds2023;

public class Pepiniere {
	private static  int MAX_PLANTES = 1000;
    private Plante[] inventaire;
    private int nombreDePlantes;

    public Pepiniere() {
        inventaire = new Plante[MAX_PLANTES];
        nombreDePlantes = 0;
    }
    
    public void ajoutPlante(Plante plante) {
        if (nombreDePlantes < MAX_PLANTES) {
            inventaire[nombreDePlantes++] = plante;
        } else {
            System.out.println("Impossible d’ajouter plus de plantes, inventaire plein !");
        }
    }
    
    
    public void afficherInventaire() {
        System.out.println("Inventaire de la pépinière :");
        for (int i = 0; i < nombreDePlantes; i++) {
            System.out.println("Plante #" + (i + 1));
            inventaire[i].description();
            System.out.println();
        }
    }
    
    
    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof Arbre) {
                total += ((Arbre) inventaire[i]).absorptionCO2();
            }
        }
        return total;
    }
    
    
    
    public int compterArbresCaduques() {
        int count = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof Arbre) {
                Arbre a = (Arbre) inventaire[i];
                if (a.getType_Feuillage().equals("caduque"))
                    count++;
            }
        }
        return count;
    }
    

}
