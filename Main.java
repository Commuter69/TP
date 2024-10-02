package atelierpoo;

/*public class Main{
    public static void main(String[] args){
        Livre tab[]=new Livre[3];
        tab[0]=new Livre("Paulo Coelho", "L'alchimiste", 225);
        tab[1]=new Livre("La Tunisie", 508);                
        tab[2]=new Livre("JK Rowling", "Harry Potter");         
        for(int i=0;i<=2;i++){
            System.out.println(tab[i].toString());
        }
        tab[1].setAuteur("Paulo Coelho");
        tab[2].setNbPages(461);
        for(int i=0;i<=2;i++){
            tab[i].decrire();
        }
    }
}*/

public class Main {
    public static void main(String[] args) {
        Livre tab[] = new Livre[3];
        tab[0] = new Livre("Paulo Coelho", "L'alchimiste", 225, 15.99);
        tab[1] = new Livre("La Tunisie", 508);
        tab[2] = new Livre("JK Rowling", "Harry Potter");
        for (int i = 0; i < 3; i++) {
            System.out.println(tab[i].toString());
        }
        tab[1].setAuteur("Paulo Coelho");
        tab[2].setNbPages(461);
        tab[1].setPrix(20.0);
        System.out.println("Prix fixé pour le livre 1 : " + tab[1].testPrix());
        tab[1].setPrix(25.0);
        for (int i = 0; i < 3; i++) {
            tab[i].decrire();
        }
    }
}