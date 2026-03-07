package sn.FatyNdao.l2gl.app.model;

import java.util.Objects;

//Identité de 'Module' = 'code' uniquement
public class Module implements Affichable, Identifiable{
    private String code;
    private String libelle;

    public Module(String code, String libelle) {
        if (code.isBlank()) {
            throw new IllegalArgumentException("Le code ne doit pas etre vide");
        }
        if (libelle.isBlank()) {
            throw new IllegalArgumentException("La libelle ne doit pas être vide");
        }
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String Afficher() {
        return "Code: " + code + " | Libelle: " + libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return Objects.equals(code, module.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String identifiant() {
        return getCode();
    }
}
