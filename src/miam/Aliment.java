package miam;

public class Aliment {

    String nom;
    Boolean estCuit;

    public void manger() {
        if (estCuit) {
            System.out.println("Itadakimasu ! "+nom+" est bien cuit !");
        }
        else {
            System.out.println("Ikara deteke ! Baka !");
        }
    }
}
