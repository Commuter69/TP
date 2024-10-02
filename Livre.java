package atelierpoo;

/*class Livre {
    private String titre, auteur;
    private float nbPages;

    public Livre() {
        this.auteur = "";
        this.titre = "";
        this.nbPages = 0;
    }

    public Livre(String titre, float nbPages) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = "";
    }
    
    public Livre(String auteur, String titre, float nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = 0;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public float getNbPages() {
        return nbPages;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(float nb) {
        if (nb>20) {
            nbPages = nb;
        } else {
            System.out.println("Le nombre de pages indique est faible");
        }
    }

    public String toString() {
        return "Livre intitulé " + titre + " de " + auteur + ", contenant " + nbPages + " pages";
    }

    public void decrire() {
        System.out.println(toString());
    }
}*/


class Livre {
    private String titre, auteur;
    private float nbPages;
    private double prix;
    private boolean prixFixe;

    public Livre() {
        this.auteur = "";
        this.titre = "";
        this.nbPages = 0;
        this.prix = 0.0;
        this.prixFixe = false;
    }

    public Livre(String titre, float nbPages) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = "";
        this.prix = 0.0;
        this.prixFixe = false;
    }
    
    public Livre(String auteur, String titre, float nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
        this.prix = 0.0;
        this.prixFixe = false;
    }

    public Livre(String auteur, String titre, float nbPages, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
        this.prix = prix;
        this.prixFixe = true;
    }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = 0;
        this.prix = 0.0;
        this.prixFixe = false;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public float getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(float nb) {
        if (nb > 20) {
            nbPages = nb;
        } else {
            System.out.println("Le nombre de pages indique est faible");
        }
    }

    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.out.println("Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }

    public boolean testPrix() {
        return prixFixe;
    }

    public String toString() {
        return "Livre intitulé " + titre + " de " + auteur + ", contenant " + nbPages + " pages, prix: " + (prixFixe ? prix : "non fixé");
    }

    public void decrire() {
        System.out.println(toString());
    }
}











