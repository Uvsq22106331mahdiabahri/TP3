package src;

import java.util.ArrayList;
import java.util.List;

public interface Groupe {
    default void afficher() {

    }
}

public class GroupePersonnel implements Groupe {
    private final String nom;
    private final List<Groupe> groupes = new ArrayList<>();
    private final List<Personnel> personnels = new ArrayList<>();

    public GroupePersonnel(String nom) {
        this.nom = nom;
    }

    public void ajouterGroupe(Groupe groupe) {
        groupes.add(groupe);
    }

    public void ajouterPersonnel(Personnel personnel) {
        personnels.add(personnel);
    }

    @Override
    public void afficher() {
        System.out.println("Groupe : " + nom);
        for (Groupe groupe : groupes) {
            groupe.afficher();
        }
        for (Personnel personnel : personnels) {
            System.out.println(personnel.getNom() + " " + personnel.getPrenom() + ", " + personnel.getFonctions());
        }
    }
}
