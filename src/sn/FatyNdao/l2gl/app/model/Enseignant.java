package sn.FatyNdao.l2gl.app.model;

public class Enseignant extends Personne{
    private final String nci;

    public Enseignant (String nom, String email, String nci) {
        super(nom, email);
        if (nci.isBlank()) {
            throw new IllegalArgumentException("Le NCI ne doit pas etre vide.");
        }
        this.nci = nci;
    }

    @Override
    public String role() {
        return "Enseignant";
    }
}
