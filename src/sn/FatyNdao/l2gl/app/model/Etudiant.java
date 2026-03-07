package sn.FatyNdao.l2gl.app.model;

import java.util.Objects;

//Identité de 'Etudiant' = 'Matricule' uniquement
public final class Etudiant extends Personne implements Affichable, Identifiable {
    private final String matricule;

    public Etudiant(String nom, String email, String matricule) {
        super(nom, email);
        if(matricule.isBlank() && !matricule.matches("\\d{4}-\\d{3}")) {
            throw new IllegalArgumentException("Le matricule ne peut pas etre vide ou doit etre en format 'YYYY-NNN'");
        }
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    @Override
    public String role() {
        return "Etudiant";
    }

    @Override
    public String identite() {
        return super.identite()+" | Matricule: "+matricule;
    }

    public String identite(String prefixe) {
        return "Nom: " +getNom()+ " | Email: "+getEmail()+" | Matricule: "+matricule+" | Prefixe: "+prefixe;
    }

    @Override
    public String Afficher() {
        return "Matricule: "+matricule+" | Nom: "+getNom();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(matricule, etudiant.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricule);
    }

    @Override
    public String identifiant() {
        return getMatricule();
    }
}
