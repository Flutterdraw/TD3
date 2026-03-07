package sn.FatyNdao.l2gl.app.model;

public class Registre<T extends Identifiable> {
    private final T[] elements;
    private Integer taille;

    public Registre(T[] elements, Integer taille) {
        if (taille == null || taille <= 0){
            throw new IllegalArgumentException("La taille ne peut pas etre nulle ou negative");
        }
        this.taille = taille;
        this.elements = elements;
    }

    public void ajouter(T e){
        if (e == null){
            throw new IllegalArgumentException("L'element ne peut pas etre nul.");
        }
        for (T element : elements) {
            if (element.equals(e)) {
                throw new IllegalArgumentException("L'element existe deja");
            }
        }
        if (elements.length == taille) {
            throw new IllegalArgumentException("Le tableau est plein");
        }
        elements[elements.length-1] = e;
    }
    public T chercherParID (String id) {
        for (T element : elements) {
            if (element.identifiant().equals(id)) {
                return element;
            }
        }
        return null;
    }
    public int taille() {
        return this.taille;
    }
}

