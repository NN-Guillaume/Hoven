package miam;

public class Four {

    private int puissance;
    private int capacite;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire( Aliment aliment) {
        System.out.println("Watashi wa : "+aliment.nom);
        System.out.println("J'ai une puissance de " + puissance + " watts ainsi qu'une capacité de " + capacite + " litres.");
        aliment.estCuit = true;
        maintenir();
    }

    private void maintenir() {

    }

    /**
     * Getters & Setters
     * @return
     */
    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        System.out.println("La puissance est modifiée !");
        this.puissance = puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public void setSoufflerie(Soufflerie soufflerie) {
        this.soufflerie = soufflerie;
    }


}
