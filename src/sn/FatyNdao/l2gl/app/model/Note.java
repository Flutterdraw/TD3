package sn.FatyNdao.l2gl.app.model;

import java.util.Objects;

//Identité de 'Note' = couple('Etudiant.matricule','Module.code')
public class Note {
    private final Etudiant etudiant;
    private final Module module;
    private Double valeur;

    public Note(Etudiant etudiant, Module module, Double valeur){
        if (valeur==null || valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("Note Invalide ou vide.");
        }
        this.etudiant = etudiant;
        this.module = module;
        this.valeur = valeur;
    }

    public void setValeur(Double valeur) {
        if (valeur==null || valeur < 0 || valeur > 20){
            throw new IllegalArgumentException("Note invalide ou vide");
        }
        this.valeur = valeur;
    }

    public boolean estValide(){
        if (valeur < 10) {
            return false;
        }
        return true;
    }

    public String mention() {
        if (valeur < 10) {
            return "Ajournee";
        } else if (valeur >=10 && valeur < 12) {
            return "Passable";
        } else if (valeur >=12 && valeur <15) {
            return "Assez bien";
        } else if (valeur >=15 && valeur <18) {
            return "Bien";
        } else {
            return "Tres bien";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(etudiant.getMatricule(), note.etudiant.getMatricule()) && Objects.equals(module.getCode(), note.module.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(etudiant.getMatricule(), module.getCode());
    }
}
