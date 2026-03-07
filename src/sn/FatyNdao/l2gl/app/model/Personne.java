package sn.FatyNdao.l2gl.app.model;

public abstract class Personne {
    private final String nom;
    private final String email;

    public Personne(String nom, String email) {
        if (nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne doit pas etre vide");
        }
        if (email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("L'email ne doit pas être vide et doit contenir '@'");
        }
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public abstract String role();

    public String identite() {
        return "Nom: " +nom+ " | Email: "+email;
    }

    public final String carte(){
        return "---------------------------\n" +
                "Role     : " + role() + "\n" +
                "Identite : " + identite() + "\n" +
                "Contacts : " + getEmail() + "\n" +
                "---------------------------";
    }

    @Override
    public String toString() {
        return carte();
    }
}
